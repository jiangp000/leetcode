package SingleNumber126;

public class SingleNumber126 {
    public static void main(String[] args) {
        int i = 2, j = 3, k = 4;
        System.out.println(i ^ i ^ j ^ j ^ k);
        System.out.println(7 ^ 15);
    }
}
//  hashmap 完全可以的
// O（n）  先遍历 nums 数组，然后再遍历 hashmap，如果 get（i） == 1 return  key
//  异或 运算  2
// 3 ^ 8
// 0111 1111  7 15  = 16
class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 1) return nums[0];
        for(int i = 1; i < nums.length; i++){
            nums[0] = nums[0] ^ nums[i];
        }
        return nums[0];

    }
}