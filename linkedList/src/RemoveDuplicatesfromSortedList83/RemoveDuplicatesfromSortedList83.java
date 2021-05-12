package RemoveDuplicatesfromSortedList83;

public class RemoveDuplicatesfromSortedList83 {
}


class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        int value = head.val;
        ListNode iter = head;
        while(iter.next != null){
            if(iter.next.val == value){
                iter.next = iter.next.next;
            }
            else{
                iter = iter.next;
                value = iter.val;
            }
        }
        return head;

    }
}
