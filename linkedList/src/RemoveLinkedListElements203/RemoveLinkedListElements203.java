package RemoveLinkedListElements203;

public class RemoveLinkedListElements203 {
}


class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null ) return  head;

        ListNode res = new ListNode(-1);
        res.next = head;
        while(res.next != null){
            // 如果说他们不相等，那么就
            if(res.next.val != val){
                res = res.next;
            }
            else{
                res.next = res.next.next;
            }
        }

        return res.next;

    }
}