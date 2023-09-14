package MajorityElement169;

public class MajorityElement169 {
}


class Solution {
    public int majorityElement(int[] nums) {
        while(true){
            int rand = (int)(Math.random() * nums.length);
            int count = 0;
            for(int i = 0; i < nums.length; i++){
                if(nums[i] == nums[rand]) count++;
            }
            if(count > nums.length / 2) return nums[rand];
        }

    }
}