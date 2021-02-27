package MinimumSizeSubarraySum209;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MinimumSizeSubarraySum209 {
    public static void main(String[] args) {
        Solution test = new Solution();
        int[] nums = {1,1,1,1,1,1,1,1,1,1};
        int target = 4;
        System.out.println(test.minSubArrayLen(target,nums));
    }
}


class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0, j = 0;
        while(j < nums.length + 1) {
            if (sum >= target) {
                sum -= nums[i];
                res.add(j - i);
                i++;
                continue;
            }
            if (j == nums.length) break;
            sum += nums[j];
            j++;
        }
        if(res.size() == 0) return 0;
        System.out.println(res);
        return Collections.min(res);

    }
}