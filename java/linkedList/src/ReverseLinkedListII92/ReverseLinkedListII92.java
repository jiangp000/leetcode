package ReverseLinkedListII92;

public class ReverseLinkedListII92 {
}



class ListNode {
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

class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null || left == right) return head;
        // 把他们绕成环
        ListNode before = new ListNode(Integer.MAX_VALUE);
        before.next = head;
        ListNode p = before;

        for(int i = 0; i < left - 1; i++){
            p = p.next;
        }
        ListNode cur = p.next;
        ListNode next;
        for(int i = 0; i < right - left; i++){
            next = cur.next;
            cur.next = next.next;
            next.next = p.next;
            p.next = next;
        }
        return before.next;

    }
}