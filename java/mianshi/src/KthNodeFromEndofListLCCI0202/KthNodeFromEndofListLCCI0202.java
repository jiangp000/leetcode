package KthNodeFromEndofListLCCI0202;

public class KthNodeFromEndofListLCCI0202 {
}

 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

//   很经典的一道题目
//   使用快慢指针，来进行


class Solution {
    public int kthToLast(ListNode head, int k) {
        ListNode first = head;
        for(int i = 0; i < k; i++){
            first = first.next;
        }

        while(first != null){
            first = first.next;
            head = head.next;
        }

        return  head.val;

    }
}