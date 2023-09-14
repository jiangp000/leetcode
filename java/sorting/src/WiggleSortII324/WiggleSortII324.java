package WiggleSortII324;

import java.util.Arrays;

public class WiggleSortII324 {
}

// 我们使用排序，加插入的方式
// 1 2 3 4 5 6
// 对于第一个 for 循环，我们得到以下的结果
// X 6 X 4 X 2
// 对于第二个 for循环，我们得到以下的结果
// 3 6 2 4 1 2  就得到了最后的结果
class Solution {
    public void wiggleSort(int[] nums) {
        int[] arr = nums.clone();
        Arrays.sort(arr);
        int n = nums.length;
        for(int i = 1; i < nums.length; i += 2){
            nums[i] = arr[--n];
        }
        for(int i = 0; i < nums.length; i += 2){
            nums[i] = arr[--n];
        }

    }
}