package CoinChange322;

import java.sql.SQLOutput;
import java.util.Arrays;

public class CoinChange322 {
    public static void main(String[] args) {
        Solution test =new Solution();
        int[] q1={1,2,5};
        int k1=11;
        System.out.println(test.coinChange(q1,k1));

//        int[] q2 ={186,419,83,408};
//        int   k2 = 6249;
//        System.out.println(test.coinChange(q2,k2));
    }
}

// 第一个数字给的太多了，可能小数字可以进行的，但是大数字就不行
// 1 2 5  11
// i=0 j:0,n dp[0] =0 dp[1] =1 dp[2]=2  dp[n]=n
// i=1 j:0,n dp[0] =0 dp[2]=1  dp[3]=2  dp[5]=3  dp[7]=4 dp[2 *n+1] =n+1
// i=2 j:0,n dp[0] =0 dp[5]=1  dp[7] =2

class Solution {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int result = 0,SUM=0;
        int[] dp =new int[amount+1];
        Arrays.fill(dp,1,dp.length,Integer.MAX_VALUE);
        for( int i =0; i<coins.length;i++){
            for(int j=coins[i]; j<=amount; j++){
                if(dp[j - coins[i]]!= Integer.MAX_VALUE){
                    dp[j] = Math.min(dp[j],dp[j-coins[i]]+1);
                }
            }
            System.out.println(Arrays.toString(dp));
        }
        System.out.println(Arrays.toString(dp));
        if(dp[amount]!=Integer.MAX_VALUE) return dp[amount];
        return -1;
    }
}