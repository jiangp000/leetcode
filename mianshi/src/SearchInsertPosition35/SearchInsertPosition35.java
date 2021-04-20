package SearchInsertPosition35;

public class SearchInsertPosition35 {
}


class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0, j = nums.length -1, ans = j + 1 ;
        while(i <= j){
            int middle = ((j - i) >> 1) + i;
            if(nums[middle] >= target){
                j = middle - 1;
                ans = middle;
            }
            else {
                i = middle + 1;
            }
        }
        return ans;

    }
}