package UglyNumberIII1201;

public class UglyNumberIII1201 {
    public static void main(String[] args) {
        System.out.println(new Solution().nthUglyNumber(5,2,11,13));
    }
}


class Solution {
    public int nthUglyNumber(int n, int a, int b, int c) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        int i = 0, j = 0, k = 0;
        int m = 1;
        while(m < n + 1){
            // 不允许有重复的
            dp[m] = Math.min(Math.min(dp[i] * a,dp[j] * b),dp[k] * c);
            // 得到了dp[m]
            if(dp[m] / dp[i] == a) i++;
            else if(dp[m] /dp[j] == b) j++;
            else k++;
            if(dp[m] == dp[m - 1]) continue;
            m++;
        }

        return dp[n];

    }
}