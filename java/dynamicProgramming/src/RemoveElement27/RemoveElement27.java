package RemoveElement27;

public class RemoveElement27 {
    public static void main(String[] args) {
        Solution test = new Solution();
        int[] arr = {3,3};
        int num = 3;
        System.out.println(test.removeElement(arr, num));
    }
}


//        输入：nums = [3,2,2,3], val = 3
//        输出：2, nums = [2,2]
//        每次遇到一个，就把最后一个放到前面来
class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length ==0) return  0;
        if(nums.length == 1 ){
            if(val == nums[0]) return  0;
            return 1;
        }
        int i = 0, j = nums.length - 1;
        while(i <= j){
            while(j >=0  && nums[j] == val){
                j--;
            }
            if(i > j) break;
            if(nums[i] == val){
                nums[i] = nums[j];
                j--;
            }
            i++;
        }
        return i ;

    }
}