package MoveZeroes283;

public class MoveZeroes283 {
    public static void main(String[] args) {
        Solution test = new Solution();
        int[] arr ={1,3,0,9,9,0,1,3,5,0,0,1};
        test.moveZeroes(arr);
    }
}


// 把最后的一个数字取出来，直到找到是零的数字
// 然后把这个数字填进去，再把倒数第二个设置为0
//  刚才的思路是错误的~
// 我们一直从前遍历，一个指针指向前面的 0 ，一个指针指向不是0的数字，因为是0的我们

//         输入: [0,1,0,3,12]
//        输出: [1,3,12,0,0]
// 第一个0，我们指向为 i，计数+1
// 然后遇到3，不是0，由于有计数，我们就向前移动一个
// 然后是0，我们计数+1，为2
// 然后遇到 3，不是0，我们向前移动两个格子
// 然后遇到 12，不是0，我们向前移动两个格子
// 最后接着后面的，把计数个0 放在后面
// success ~
class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0, temp = 0;
        while(i < nums.length ){
            if(nums[i] == 0){
                temp++;
            }
            else{
                int j = i;
                for(int k = 0; k < temp; k++){
                    j--;
                }
                nums[j] = nums[i];
            }
            i++;
        }
        i -= temp;
        System.out.println(i - temp);;
        while (i < nums.length){
            nums[i] = 0;
            i++;
        }
        for(int o : nums){
            System.out.println(o);
        }

    }
}