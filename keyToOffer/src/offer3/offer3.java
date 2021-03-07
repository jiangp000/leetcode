package offer3;

import java.util.Arrays;
class Solution {
    public int findRepeatNumber(int[] nums) {
        int[] result = new int[nums.length];
        Arrays.fill(result,-1);
        for(int i = 0; i < nums.length; i ++){
            if(result[nums[i]] == -1){
                result[nums[i]] =  nums[i];
            }
            else {
                return nums[i];
            }
        }
        return 0 ;

    }
}
public class offer3 {
    public static void main(String[] args) {
        Solution test = new Solution();
        int[] arr = {2, 3, 1, 0, 2, 5, 3};
        System.out.println(test.findRepeatNumber(arr));
    }

}
