package MissingNumber268;

public class MissingNumber268 {
}


class Solution {
    public int missingNumber(int[] nums) {
        int required = 0;
        for(int i = 0; i < nums.length; i++){
            required = required + i - nums[i];
        }
        required += nums.length;
        return required;
    }
}