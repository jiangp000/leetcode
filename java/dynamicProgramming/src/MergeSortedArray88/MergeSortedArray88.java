package MergeSortedArray88;

public class MergeSortedArray88 {
    public static void main(String[] args) {
        Solution test = new Solution();
        int[] num1 = {1,2,3,0,0,0};
        int[] num2 = {2,5,6};
        test.merge(num1,3,num2,3);
    }
}
//[1,2,3,0,0,0]
//        3
//        [2,5,6]
//        3

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m + n];
        int i = 0, j = 0, k = 0;
        while(i < m && j < n){
            if(nums1[i] > nums2[j]){
                arr[k++] = nums2[j++];
            }
            else{
                arr[k++] = nums1[i++];
            }
        }

        while(i < m){
            arr[k++] = nums1[i++];
        }

        while(j < n){
            arr[k++] = nums2[j++];
        }

        for(int p = 0; p < m + n; p++){
            nums1[p] = arr[p];
        }

    }
}