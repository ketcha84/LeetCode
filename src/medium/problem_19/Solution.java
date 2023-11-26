package medium.problem_19;

public class Solution {

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tmp = head;
        int sz = 1;

        while (head.next != null) {
            head = head.next;
            sz++;
        }

        head = tmp;

        if (sz == n) {
            return head.next;
        }

        for (int i = 0; i < sz - n - 1; i++) {
            head = head.next;
        }

        if (n == 1) {
            head.next = null;
        } else {
            head.next = head.next.next;
        }

        head = tmp;
        return head;
    }
}
