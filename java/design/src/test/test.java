package test;

public class test {
    public static void main(String[] args) {
        Solution test = new Solution();
        int[] num = {1,0,1,1,0,1};
        System.out.println(test.findMaxConsecutiveOnes(num));
    }
}



class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                int temp = 0;
                int j = i;
                while (j < nums.length && nums[j] == 1) {
                    j++;
                    temp++;
                }
                res = Math.max(res, temp);
                i = j;
            }
        }
        return res;
    }
}