package MinCostClimbingStairs746;

public class MinCostClimbingStairs746 {
    public static void main(String[] args) {
        Solution test = new Solution();
        int[] arr = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(test.minCostClimbingStairs(arr));
    }
}



class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp1 = new int[cost.length + 1];
        // 我们选择第一个,可以选择一个，或者是选择两个
        //  0 1 100 1 1
        // dp[2] =
        // dp[2]
        dp1[0] = 0;
        dp1[1] = 0;
        for(int i = 2; i < dp1.length; i++){
            dp1[i] = Math.min(dp1[i - 1]  + cost[i - 1],dp1[i - 2] + cost[i - 2] );
        }
        System.out.println(dp1[cost.length ]);

        return dp1[cost.length];


    }
}
