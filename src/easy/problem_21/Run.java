package easy.problem_21;

public class Run {
    public static void main(String[] args) {
        Solution.ListNode list1 = new Solution.ListNode(1, new Solution.ListNode(2,new Solution.ListNode(4)));
        Solution.ListNode list2 = new Solution.ListNode(1, new Solution.ListNode(3,new Solution.ListNode(4)));

        Solution sol = new Solution();

        Solution.ListNode ans = sol.mergeTwoLists(list1, list2);
        prn(ans);
    }

    private static void prn(Solution.ListNode ans) {
        while (ans != null) {
            System.out.println(ans.val);
            ans = ans.next;
        }
    }
}
