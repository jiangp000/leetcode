package PartitionListLCCI0204;

public class PartitionListLCCI0204 {
}
 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
// 创建两个链表，一个比他小，一个不比他小，然后拼接上去就oKle


  class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head == null) return head;
        ListNode small = new ListNode(0), big = new ListNode(0);
        ListNode firstHead = small, secondHead = big;
        while(head != null){
            ListNode temp = new ListNode(head.val);
            if(head.val < x){
                small.next = temp;
                small = small.next;
            }
            else{
                big.next = temp;
                big = big.next;
            }
            head = head.next;
        }

        small.next = secondHead.next;
        return firstHead.next;


    }
}