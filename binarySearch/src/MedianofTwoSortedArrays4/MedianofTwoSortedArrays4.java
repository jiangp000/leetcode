package MedianofTwoSortedArrays4;

public class MedianofTwoSortedArrays4 {
}


// 我现在只会 O（m + n）的方法来解决

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int L = nums1.length, R = nums2.length;
        if(nums1.length == 0 && nums2.length == 0) return (double) 0;
        // 如果是偶数，此时应该找两个数字，int
        int i = 0, j = 0;
        int num = 0;
        if( (L + R) % 2 ==0){
            int middle1 = 0, middle2 = 0;
            while(i < L && j < R){
                int temp = 0;
                if(nums1[i] <=  nums2[j]){
                    temp = nums1[i];
                    i++;
                }
                else{
                    temp = nums1[j];
                    j++;
                }
                num++;
                if(num == (L + R) / 2 ){
                    middle1 = 0;
                }
            }

        }

        if( (L + R) % 2 == 0){

        }
        return  0;

    }
}