package LengthofLongestFibonacciSubsequence873;

import java.util.HashSet;

public class LengthofLongestFibonacciSubsequence873 {
    public static void main(String[] args) {
        Solution test = new Solution();
        test.getDp();
    }
}


class Solution {
    static int[] dp;
    static HashSet<Integer>  set;
    public void getDp(){
        dp = new int[1001];
        dp[0] = 1;
        dp[1] = 2;
        set.add(1);
        for(int i = 2; i < 45; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
//            if(dp[i] >  2) break;
            System.out.println(dp[i]);
        }
        return;
    }
    public int lenLongestFibSubseq(int[] arr) {
        return 0;
    }
}