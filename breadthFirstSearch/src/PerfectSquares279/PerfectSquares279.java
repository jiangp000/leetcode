package PerfectSquares279;

public class PerfectSquares279 {
    public static void main(String[] args) {
        new Solution().consrtuct();
    }
}


//dp [n] = dp[ Math.sqrt(n)蒸熟部分] + dp[n - A^2]
// 不一定是选最大的部分， 12 选 三个4，也比选一个9 好
// 所以，我们的这个动态转移方程是有问题的,这个是O（n 根号n），但是还是不行~ QAQ


class Solution {
    int[] dp;
    public void consrtuct(){
        dp = new int[100000];
        for(int i = 1; i <= 10000; i++){
            dp[i] = i;
            // 当j =1 的时候，11 比它的多
            for(int j = 1; i - j * j >=0; j++){
                dp[i] = Math.min(dp[i],dp[i - j * j] + 1);
            }
        }
        for(int i = 0; i < dp.length; i++){
            System.out.println(i+ "   " + dp[i]);
        }
    }
    public int numSquares(int n) {
        consrtuct();
        return dp[n];
    }
}