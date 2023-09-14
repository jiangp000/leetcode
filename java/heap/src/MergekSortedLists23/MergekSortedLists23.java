package MergekSortedLists23;

import java.util.PriorityQueue;

public class MergekSortedLists23 {
}


class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> q = new PriorityQueue<>((x,y)->x.val - y.val);
        for(ListNode node :lists){
            if(node != null){
                q.add(node);
            }
        }

        ListNode head = new ListNode(0);
        ListNode tail = head;
        // 每次就取一个数字出来，如果tail.next != null，就把他加到我们的队列中去
        // 从你的全世界路过，把全盛的爱都活过
        while(!q.isEmpty()){
            tail.next = q.poll();
            tail = tail.next;
            if(tail.next != null){
                q.add(tail.next);
            }
        }
        return  head.next;
    }
}