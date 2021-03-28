package FindMinimuminRotatedSortedArray153;

public class FindMinimuminRotatedSortedArray153 {
    public static void main(String[] args) {
        System.out.println(new Solution().findMin(new int[]{1}));
    }
}



// 中间有一个数字，他不满足升序的条件，我们先找到这个点，然后进行搜索
class Solution {
    public int getMiddle(int[] nums){
        int i = 0, j = nums.length - 1;
        while(i <= j){
            int index = i + (j - i) / 2;
            if(nums[index] > nums[index + 1]){
                return index;
            }
            else {
                // 说明他就不是中心，此时我们判断 i 和 j 应该赋予什么数值
                // 说明在后面
                if(nums[index] > nums[nums.length - 1]){
                    i = index + 1;
                }
                else{
                    j = index - 1;
                }
            }
        }
        // 这个是数组没有反转，index 是
        return -1;
    }
    public int findMin(int[] nums) {
        if(nums.length == 1 ) return  nums[0];
        int middle = getMiddle(nums);
        if(middle == -1) return  nums[0];
        return  nums[middle + 1];
    }
}