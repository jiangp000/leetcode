package LinkedListRandomNode382;

import java.util.Random;

public class LinkedListRandomNode382 {
}


 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  // 不能更改原来的head 头节点
class Solution {
    ListNode head;
    public Solution(ListNode head) {
        this.head = head;
    }
    // 当只有一个数字的时候，概率是 1 / 1 = 1
    // 当只有两个数字的时候，先取数字 1，random.nextInt(2) 可能是0，也可能是1
    // 如果是0的话，就会被替换，就是1/2,如果不是0，也是1/2
    public int getRandom() {
        int res = head.val;
        ListNode temp = head;
        temp = temp.next;
        int i = 2;
        Random r = new Random();
        while( temp != null){
            if(r.nextInt(i) == 0){
                res = temp.val;
            }
            i++;
            temp=temp.next;
        }
        return  res;

    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */