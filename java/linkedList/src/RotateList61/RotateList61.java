package RotateList61;

public class RotateList61 {
}


 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return  head;
        ListNode iter = head;
        int len = 1;
        //  1 -> 2
        //  得到最后一个结尾，要把第一个连起来
        while(iter.next != null){
            len++;
            iter = iter.next;
        }
        // 当 k = 1的时候，是最后的位置
        // 当 k = len 的时候，是最开始
        int first = len - k % len;
        if(first == len) return head;
        iter.next = head;
        // 将链表闭合，形成一个 环状的链表
        //  k = 2，len = 3，此时first = 1，此时iter 就是首部
        // 此时iter 还是最后的位置
        // 如果first 为0，则直接就是 iter.next
        // 如果first 是1，那么则需要循环一下
        while(first-- > 0){
            iter = iter.next;
        }
        ListNode res = iter.next;
        // iter 此时是结果的尾巴
        iter.next = null;
        // 最后把这个环给去除掉，
        return res;

    }
}

