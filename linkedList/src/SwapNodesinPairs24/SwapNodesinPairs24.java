package SwapNodesinPairs24;

public class SwapNodesinPairs24 {
}


 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
//   1 2 3 4 5
//   2
// 此时head 是1
//1.next =
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode node = head.next;
        head.next = swapPairs(node.next);
        node.next = head;
        return node;

    }
}