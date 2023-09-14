package OddEvenLinkedList328;

public class OddEvenLinkedList328 {
}


class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }



class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode before = head, after  = head.next;
        ListNode res1 = before, res2 = after;

        ListNode pre1 = head;
        while(pre1 != null && pre1.next != null){
            if(pre1.next.next == null){
                before.next = null;
                break;
            }
            before.next =  new ListNode(pre1.next.next.val);
            pre1 = pre1.next.next;
            before = before.next;
        }

        ListNode pre2 = head.next;
        while(pre2 != null && pre2.next != null){
            if(pre2.next.next == null){
                after.next = null;
                break;
            }
            after.next =  new ListNode(pre2.next.next.val);
            pre2 = pre2.next.next;
            after = after.next;
        }
        //在得到最后最后的结果
        ListNode endRes1 = res1;
        while(endRes1.next != null){
            endRes1 = endRes1.next;
        }
        endRes1.next = after;
        return before.next;
    }
}