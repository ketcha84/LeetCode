package easy.problem_21;

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


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode node = new ListNode();
        ListNode tmp = node;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                node.val = list1.val;
                node.next = new ListNode();
                node = node.next;
                list1 = list1.next;
            } else {
                node.val = list2.val;
                node.next = new ListNode();
                node = node.next;
                list2 = list2.next;
            }
        }

        if (list1 == null) {
            addList(list2, node);
        } else {
            addList(list1, node);
        }

        return tmp;
    }

    private void addList(ListNode list, ListNode answer) {
        if(list.next == null){
            answer.val = list.val;
            return;
        }

        while (list.next != null) {
            answer.val = list.val;
            answer.next = new ListNode(list.next.val);
            answer = answer.next;
            list = list.next;
        }
    }
}
