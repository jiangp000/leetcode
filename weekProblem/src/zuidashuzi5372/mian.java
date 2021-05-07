package zuidashuzi5372;

import java.util.Arrays;

public class mian {
}


class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        if(arr[0] != 1) arr[0] = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] - arr[i - 1] > 1){
                // 是等于自己呢？ 还是加一？
                // 如果后面数字不相等，那么就是加一，如果相等，那么就
                arr[i] = arr[i - 1] + 1;
            }
        }
        System.out.println(arr[arr.length - 1]);
        return  arr[arr.length - 1];

    }
}