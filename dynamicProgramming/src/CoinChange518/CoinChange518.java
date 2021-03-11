package CoinChange518;

import java.util.Arrays;

public class CoinChange518 {
    public static void main(String[] args) {
        Solution test = new Solution();
        int[] arr = {3,5,7,8,9,10,11};
        int result = 500;
        System.out.println(test.change(result,arr));
    }
}

//500
//        [3,5,7,8,9,10,11]
class Solution {
    public int change(int amount, int[] coins) {
        if(amount == 0) return 1;
        int[][] dp = new int[coins.length + 1][amount + 1];
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                dp[i][j] = -1;
            }
        }
        return  process(coins,0,amount,dp);
    }
//     在我们的递归方程中，只有 index 和 res 两个是变化的，所以，我们可以使用记忆化的搜索来解决

    public int process(int[] arr, int index, int res, int[][] dp){
        if(dp[index][res] != -1) return  dp[index][res];
        if(index == arr.length ){
            dp[index][res] = res== 0 ? 1 : 0;
            return dp[index][res];
        }
        int result = 0;
        for(int j = 0; j * arr[index] <= res; j++){
            result += process(arr,index + 1,res - arr[index] * j,dp);
        }
        dp[index][res] = result;
        return  result;
    }
}
