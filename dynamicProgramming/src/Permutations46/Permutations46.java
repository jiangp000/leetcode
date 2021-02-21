package Permutations46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Permutations46 {
    public static void main(String[] args) {
        Solution test = new Solution();
        int[] nums = {1, 2, 3};
        test.permute(nums);

    }
}

// 1 2 3
//A 33 = 3 * 2 = 6 种

class Solution {
    public void backTrace(int N, List<Integer> temp, List<List<Integer>> result, int first){
        if(first == N){
            result.add(new ArrayList<Integer>(temp));
            System.out.println(temp.toString());
        }
        for(int i = first; i < N; i++){
            Collections.swap(temp,i,first);
            backTrace(N,temp,result,first + 1);
            Collections.swap(temp,i,first);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer>  temp = new ArrayList<>();
        for(int num : nums){
            temp.add(num);
        }
        int N = nums.length;
        backTrace(N,temp,result,0);

        return result;
    }
}