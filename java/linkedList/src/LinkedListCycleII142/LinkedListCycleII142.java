package LinkedListCycleII142;

import java.util.HashMap;
import java.util.HashSet;

public class LinkedListCycleII142
{
}



  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }


//class Solution {
//    private HashSet<ListNode> data;
//    public ListNode detectCycle(ListNode head) {
//        data = new HashSet();
//        while(head != null){
//            if(data.contains(head)) return head;
//            data.add(head);
//            head = head.next;
//        }
//        return null;
//
//
//    }
//}

class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        ListNode slow = head, fast = head;
        while(fast != null){
            slow = slow.next;
            if(fast.next != null){
                fast = fast.next.next;
            }
            else{
                return null;
            }

            if(fast == slow){
                ListNode ptr = head;
                while(ptr != slow){
                    ptr = ptr.next;
                    slow = slow.next;
                }
                return ptr;
            }

        }
        return null;

    }
}