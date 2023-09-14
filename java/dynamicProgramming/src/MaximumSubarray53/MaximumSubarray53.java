package MaximumSubarray53;

public class MaximumSubarray53 {
    public static void main(String[] args) {
        Solution test =new Solution();
        int[] a1={1,2,-9,8,10};
        System.out.println(test.maxSubArray(a1));
    }
}



class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0],temp=0;
        for(int i=0; i<nums.length; i++){
            temp+=nums[i];
            if(max < temp){
                max =temp;
            }
            if(temp <0){
                temp =0;
            }
        }
        return max;

    }
}