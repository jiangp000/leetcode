package AddTwoNumbers2;


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode temp = result;
        int add = 0;
        while(l1 != null || l2 != null || add !=0 ){
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;
            int value = val1 + val2 + add;
            temp.next = new ListNode(value % 10);
            temp = temp.next;
            add = value / 10;
            if(l1 != null)l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        return result.next;

    }
}
public class AddTwoNumbers2 {
}
