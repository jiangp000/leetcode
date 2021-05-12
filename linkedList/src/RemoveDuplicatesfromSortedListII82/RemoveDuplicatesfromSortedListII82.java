package RemoveDuplicatesfromSortedListII82;

public class RemoveDuplicatesfromSortedListII82 {
}

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode res = new ListNode(200);
        ListNode iter = head, before = res;
        ListNode result = before;
        int value = iter.val;
        boolean flag = false;
        while (iter.next != null){
            // 如果说有几个数字一直相等的话
            // 1 2 2
            if(value == iter.next.val) {
                iter = iter.next;
                while (iter.next != null && iter.next.val == value) {
                    iter = iter.next;

                }
                flag = false;
            }
            else{
                before.next = new ListNode(iter.val);
                before = before.next;
            }
            // 如果是相等的话，就没有必要了
            if(iter.next != null){
                value = iter.next.val;
                iter = iter.next;
                flag = true;
            }
            // 此时就会把他全部跳过
        }
        // value =1 的时候，是不应该的有的，但是他有了

        if(before.val == value || flag == false) return result.next;
        before.next = new ListNode(iter.val);
        before = before.next;
        return result.next;


    }
}