package FindPeakElement162;

public class FindPeakElement162 {
    public static void main(String[] args) {
        System.out.println(new Solution().findPeakElement(new int[]{1,2,3,1}));
    }
}


// 好像和自己想的，稍稍有点不太一样
// 就是找最大的嘛，和刚才是一样的

class Solution {
    public int findPeakElement(int[] nums) {
        int i = 0, j = nums.length - 1;
        while(i < j){
            int middle = i + (j - i) / 2;
            if(nums[middle] > nums[middle + 1]){
                // 自己中间的比右边的要大，说明
                // 说明自己可能是最大的了，
                // 说明自己还不是最大的，但是下一个可能是
                j = middle;
            }
            else{
                i = middle + 1;
            }
        }
        return  nums[i];

    }
}