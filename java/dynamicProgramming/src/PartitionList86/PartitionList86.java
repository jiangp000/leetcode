package PartitionList86;

public class PartitionList86 {
    public static void main(String[] args) {

    }
}


class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


  // 我们可以创建新的链表，一个是大的，一个是小的，这样子就很好
  //
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode s1 = new ListNode(0), s2 = new ListNode(0), p = head;
        ListNode first = s1, second = s2;
        while (head != null){
            if(head.val < x){
                s1.next = new ListNode(head.val);
                s1 = s1.next;
            }
            else{
                s2.next = new ListNode(head.val);
                s2 = s2.next;
            }
            head = head.next;
        }
        s1.next = second.next;
        return  first.next;

    }
}