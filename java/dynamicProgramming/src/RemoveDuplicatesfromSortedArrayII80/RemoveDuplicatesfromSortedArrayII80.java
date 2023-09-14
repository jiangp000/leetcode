package RemoveDuplicatesfromSortedArrayII80;

public class RemoveDuplicatesfromSortedArrayII80 {
    public static void main(String[] args) {
        Solution test = new Solution();
        int[] arr = {0,0,1,1,1,1,2,3,3};
        System.out.println(test.removeDuplicates(arr));
    }
}


class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length < 3) return  nums.length;
        int i = 0, j = 1, flag = 1;
        // 快慢指针，慢指针指向前面的，快指针就往前跑
        while (j < nums.length ){
            if(nums[i] == nums[j]){
                i++;
                nums[i] = nums[j];
                flag++;
                if(flag > 1){
                    // flag就是2，那么就要把j一直跑到没有重复数字的时候
                    while(j < nums.length && nums[j] == nums[i]){
                        j++;
                    }
                    flag = 0;
                }
                else{
                    j++;
                }
            }
            // 如果我们不相等的话，那就是说 flag = 0了，此时只需要 j++，flag = 0
            else{
                i++;
                nums[i] = nums[j];
                j++;
                flag = 1;
            }
        }
        return  i + 1;

    }
}