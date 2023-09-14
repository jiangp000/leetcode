package HUANYINGBI;

import java.util.Arrays;

public class main {
}


class Solution {
    public int coinChange(int[] coins, int amount) {
        // 将零钱进行排序
        Arrays.sort(coins);
        int result = 0, SUM = 0;
        int[] dp = new int[coins.length + 1];
        Arrays.fill(dp,1,dp.length,Integer.MAX_VALUE);
        for(int i = 0; i < coins.length; i++){
            for(int j = coins[i]; j <= amount;j++){
                if(dp[j - coins[i]] != Integer.MAX_VALUE){
                    dp[j] = Math.min(dp[j],dp[j - coins[i]] + 1);
                }
            }
        }
        if(dp[amount] != Integer.MAX_VALUE) return dp[amount];
        return -1;
    }
}