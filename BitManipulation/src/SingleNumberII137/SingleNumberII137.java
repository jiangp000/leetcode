package SingleNumberII137;

public class SingleNumberII137 {
}

//12 13 14 15
//2345 & 1
class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int i = 0; i < 32; i++){
            int count = 0;
            for(int j = 0; j < nums.length; j++){
                if( (nums[j] >>> i & 1) == 1){
                    count++;
                }
            }
            if(count % 3 == 0){
                ans = ans | 1 << i;
            }
        }
        return ans;

    }
}