package FindMinimuminRotatedSortedArrayII154;

public class FindMinimuminRotatedSortedArrayII154 {
}


class Solution {
    public int findMin(int[] nums) {
        int i = 0, j = nums.length - 1;
        while(i < j){
            int middle = i + (j - i) / 2;
            // 说明大的在最前面，j 本身可能是一个
            if(nums[middle] < nums[j]){
                j = middle;
            }
            // 说明大的在后面
            else if(nums[middle] > nums[j]){
                i = middle + 1;
            }
            else{
                j -= 1;
            }
        }
        return nums[i];

    }
}