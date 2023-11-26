package medium.problem_19;

public class Run {
    private static Solution.ListNode head = new Solution.ListNode();

    public static void main(String[] args) {
        Solution.ListNode tmp = head;
        head.val = 1;
//        head.next = new Solution.ListNode(2);

//        head = head.next;
//        head.next = new Solution.ListNode(3);
//        head = head.next;
//        head.next = new Solution.ListNode(4);
//        head = head.next;
//        head.next = new Solution.ListNode(5);

        head = tmp;

        Solution sol = new Solution();
        head = sol.removeNthFromEnd(head, 1);
        prn(head);
    }

    private static void prn(Solution.ListNode head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
