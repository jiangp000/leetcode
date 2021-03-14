package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class shuru4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        while (true) {
            int num = reader.nextInt();
            if (num == 0) break;
            int res = 0;
            for (int i = 0; i < num; i++) {
                res += reader.nextInt();
            }
            System.out.println(res);
        }
    }

    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length + 1];
        dp[0] = 0;
        dp[1] = nums[0] >=0 ? nums[0] : 0;
        for(int i = 2; i < dp.length; i++){
            if(nums[i - 1] + dp[i - 1] > 0) dp[i] = nums[i - 1] + dp[i - 1];
            else dp[i] = 0;
        }

//        如果全是0 的话，则有偏差的
        int flag = 0;
        for(int i = 0; i < dp.length; i++){
            if(dp[i] > 0){
                flag = 1;
                break;
            }
        }
        if(flag == 1) {
            int max = dp[0];
            for (int i = 0; i < dp.length; i++) {
                if (dp[i] > max) max = dp[i];
            }
            return max;
        }
        else{
            int max = nums[0];
            for(int i = 0; i  < nums.length; i++){
                if(max < nums[i]) max = nums[i];
            }
            return max;
        }

    }
}
