package medium.problem_2;

/**
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public class ListNode {
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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode mergedList = new ListNode();
        ListNode tmpList = mergedList;
        ListNode tmpl1 = l1;
        ListNode tmpl2 = l2;

        while (tmpl1 != null && tmpl2 != null) {
            int sum = tmpl1.val + tmpl2.val + tmpList.val;
            if (sum >= 10) {
                tmpList.val = sum % 10;
                tmpList.next = new ListNode(sum / 10);
                tmpList = tmpList.next;
                tmpl1 = tmpl1.next;
                tmpl2 = tmpl2.next;
            } else {
                tmpList.val = sum;
                tmpList.next = new ListNode();
                tmpList = tmpList.next;
                tmpl1 = tmpl1.next;
                tmpl2 = tmpl2.next;
            }
        }

        while (tmpl1 != null) {
            int sum = tmpl1.val + tmpList.val;
            if (sum >= 10) {
                tmpList.val = sum % 10;
                tmpList.next = new ListNode(sum / 10);
                tmpList = tmpList.next;
                tmpl1 = tmpl1.next;
            } else {
                tmpList.val = sum;
                tmpList.next = new ListNode();
                tmpList = tmpList.next;
                tmpl1 = tmpl1.next;
            }
        }

        while (tmpl2 != null) {
            int sum = tmpl2.val + tmpList.val;
            if (sum >= 10) {
                tmpList.val = sum % 10;
                tmpList.next = new ListNode(sum / 10);
                tmpList = tmpList.next;
                tmpl2 = tmpl2.next;
            } else {
                tmpList.val = sum;
                tmpList.next = new ListNode();
                tmpList = tmpList.next;
                tmpl2 = tmpl2.next;
            }
        }
        tmpList = mergedList;
        while (tmpList.next.next != null) {
            tmpList = tmpList.next;
        }
        if (tmpList.next.val == 0) {
            tmpList.next = null;
        }
        return mergedList;
    }
}