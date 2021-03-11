package UniquePaths62;

public class UniquePaths62 {
    public static void main(String[] args) {
        Solution test =new Solution();
        int m1=3,m2=7;
        System.out.println(test.uniquePaths(m1,m2));
    }
}


//class Solution {
//    public int getSum(int n){
//        int result = 0;
//        for(;n>=0;n--){
//            result += n;
//        }
//        return result;
//    }
//
//    public int uniquePaths(int m, int n) {
//        // 具有对称性质
//        if(m < n){
//            int temp = m;
//            m = n;
//            n = temp;
//        }
//        // 确保 m 是大的，然后 n 是小的
//        if(n == 1) return 1;
//        else if(n == 2) return m;
//        else if(n == 3) return getSum(m);
//        else{
//            return uniquePaths(m-1,n)+uniquePaths(m,n-1);
//        }
//
//    }
//}


class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                dp[i][j] = -1;
            }
        }
        return  process(m,n,dp);

    }

    public int process(int m, int n, int[][] dp){
        if(dp[m][n] != -1){
            return  dp[m][n];
        }
        if(m == 1) {
            dp[m][n] = 1;
            return  1;
        }
        if(n == 1){
            dp[m][n] = 1;
            return  1;
        }
        dp[m][n] = process(m - 1,n,dp) + process(m,n - 1,dp);
        return  dp[m][n];
    }
}