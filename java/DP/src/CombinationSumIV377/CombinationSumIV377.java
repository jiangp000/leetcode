package CombinationSumIV377;

public class CombinationSumIV377 {
}

// 相当于爬楼梯的问题，阶数一共是target，一次可以走的步数是num[i]，问一共有多少种走法
// 这个和兑换零钱问题，很类似
class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for(int i = 1; i <= target; i++){
            for(int j = 0; j < nums.length; j++){
                if(i >= nums[j]){
                    dp[i] += dp[i - nums[j]];
                }
            }
        }

        return dp[target];

    }
}