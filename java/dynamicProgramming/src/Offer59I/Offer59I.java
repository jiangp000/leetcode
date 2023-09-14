package Offer59I;

import java.util.Arrays;

public class Offer59I {
    public static void main(String[] args) {
        Solution test = new Solution();
        int[] num = { 1,3,-1,-3,5,3,6,7};
        int k = 3;
        test.maxSlidingWindow(num,k);
    }
}
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(k == 0 || nums.length == 0) return new int[0];
        int i = 0, j = 0, res =0, index = 0, maxNum = Integer.MIN_VALUE,
                maxNumIndex = 0;
        int[] result = new int[nums.length - k + 1];
        while(j < nums.length + 1){
            if(res == k){
                result[index ++] = maxNum;
                if(i == maxNumIndex){
                    j = i + 1;
                    i ++;
                    res = 0;
                    maxNum = Integer.MIN_VALUE;
                }
                else{
                    i ++;
                    res -= 1;
                }
            }
            else{
                if(j == nums.length) break;;
                if(nums[j] > maxNum){
                    maxNum = nums[j];
                    maxNumIndex = j;
                }
                res ++;
                j ++;
            }
        }
        for(int m : result){
            System.out.println(m);
        }
        return result;
    }
}