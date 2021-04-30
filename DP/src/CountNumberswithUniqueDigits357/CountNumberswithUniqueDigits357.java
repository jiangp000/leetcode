package CountNumberswithUniqueDigits357;

public class CountNumberswithUniqueDigits357 {
}



class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n == 0) return 1;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 10;
        for(int i= 2; i < n + 1; i++){
            dp[i] = dp[i - 1] +( (dp[i -1] - dp[i - 2]) * (11 - i));
        }
        return  dp[n];


    }
}