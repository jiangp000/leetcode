package LinkedListCycle141;

import java.util.HashMap;

public class LinkedListCycle141 {
    public static void main(String[] args) {
        ListNode temp = new ListNode(0);
        ListNode s1 = temp, s2 = temp;
        System.out.println(s1 == s2);
    }
}

  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }


class Solution {
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode,Integer> res = new HashMap<>();
        while(head != null){
            if(res.containsKey(head)){
                return true;
            }
            res.put(head,1);
            head = head.next;
        }
        return false;

    }
}