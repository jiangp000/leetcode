package IntersectionofTwoLinkedLists160;

public class IntersectionofTwoLinkedLists160 {
}


class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

//  定住一个，然后用相等去比较，此时是 N^2 的复杂度，不可以
//
class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode head1 = headA;
        ListNode head2 = headB;

        while(head1 != head2){
            if(head1 != null){
                head1 = head1.next;
            }
            // 如果 A 已经完成了，此时就让 A = B
            // 在某一个时刻，PA 和 PB 一定会相遇
            else{
                head1 = headB;
            }

            if(head2 != null){
                head2 = head2.next;
            }
            else{
                head2 = headA;
            }
        }
        return head1;

    }
}