package UglyNumberII264;

import java.util.ArrayList;
import java.util.Arrays;

public class UglyNumberII264 {
    public static void main(String[] args) {
        Solution test =new Solution();
        test.nthUglyNumber(99);
    }
}

// 想法：找到所有的数字，直接返回就可以
class Solution {
    public int nthUglyNumber(int n) {
        int[] result =new int[n+1];
        result[0]=1;
        int p2=0,p3=0,p5=0;
        for(int i=1;i<n+1;i++){
            result[i] = Math.min(result[p5]*5,Math.min(result[p2]*2,result[p3]*3));
            if(result[i] == result[p2] * 2) p2++;
            if(result[i] == result[p3] * 3) p3++;
            if(result[i] == result[p5] * 5) p5++;
        }
        return  result[n-1];

    }
}