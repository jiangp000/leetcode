package MergeTwoSortedLists21;


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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        ListNode root = new ListNode();
        if(l1.val > l2.val){
            root.val = l2.val;;
            root.next = mergeTwoLists(l1,l2.next);
        }
        else{
            root.val = l1.val;
            root.next = mergeTwoLists(l1.next,l2);
        }

        return root;
    }
}
public class MergeTwoSortedLists21 {
}
