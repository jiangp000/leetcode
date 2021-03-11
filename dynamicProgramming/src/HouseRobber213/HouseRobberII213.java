package HouseRobber213;

public class HouseRobberII213 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 1};
        Solution test = new Solution();
        System.out.println(test.rob(arr));
    }
}


// 我们可以偷两边，选择偷前面一个，就把后面的去掉，
// 如果不偷前面那个，就把后面的那个去掉

class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        int result = 0;
        dp[0] = 0;
        dp[1] = nums[0];
        for(int i = 2; i < nums.length ; i++){
            dp[i] = Math.max(dp[i - 1],dp[i - 2] +nums[i - 1]);
        }
        result = dp[dp.length - 1];
        System.out.println(result);
        dp[dp.length - 1] = 0;
        dp[dp.length - 2] = nums[nums.length - 1];
        for(int j = nums.length - 3; j >= 0; j--){
            dp[j] = Math.max(dp[j + 1],dp[j + 2] + nums[j + 1]);
        }
        if(result > dp[0]) return result;
        return dp[0];


    }
}