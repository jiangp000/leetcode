package SortList148;

import java.util.Arrays;

public class SortList148 {
    public static void main(String[] args) {
        Solution test = new Solution();
        int[] arr ={4,2,1,3};
        test.QuickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
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
    public int getNum(ListNode head){
        int result = 0;
        while(head != null){
            result++;
            head = head.next;
        }
        return result;
    }
    public void fillArrays(int[] result,ListNode node){
        int i =0;
        while(node != null){
            result[i] = node.val;
            node = node.next;
            i ++;
        }

    }
    public ListNode fromArrayToList(int[] num){
        ListNode root =new ListNode();
        if(num == null || num.length == 0) return null;
        root = new ListNode( num[0] );
        ListNode temp = root ;
        for(int i=1;i<num.length;i++){
            temp.next = new ListNode(num[i]);
            temp = temp.next;
        }
        return root;
    }
    public void QuickSort(int[] num,int start,int end){
        if(start < end){
            int middle = quicksort(num,start,end);
            QuickSort(num,0,middle - 1);
            QuickSort(num,middle + 1,end);
            Arrays.sort(num);
        }
    }
    public int quicksort(int[] arr,int low,int high){
        int temp = arr[high];
        while(low < high){
            while(low < high && arr[low] <= temp){
                low++;
            }
            if(low < high){
                arr[high] = arr[low];
                high--;
            }
            while(low < high && temp > arr[high]){
                high--;
            }
            if(low < high){
                arr[low] = arr[high];
            }
        }
        arr[high] = temp;
        return high;
    }
    public ListNode sortList(ListNode head) {
        if(head == null) return null;
        int listSize = getNum(head);
        int[] result =new int[listSize];
        fillArrays(result,head);
        QuickSort(result,0,listSize - 1);
        return fromArrayToList(result);


    }
}