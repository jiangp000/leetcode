package PermutationsII47;

import java.util.*;

public class PermutationsII47{

}

class Solution {
    public void backTrace(int N, List<Integer> temp, Set<List<Integer>> result, int start) {
        if (start == N) {
            result.add(new ArrayList<>(temp));
        }
        for (int i = 1; i < N; i++) {
            Collections.swap(temp, i, start);
            backTrace(N, temp, result, i + 1);
            Collections.swap(temp, i, start);
        }

    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();

        List<Integer> temp = new ArrayList<>();
        for (int num : nums) {
            temp.add(num);
        }

        int N = nums.length;
        backTrace(N, temp, result, 0);
        for(List<Integer> Q : result){
            System.out.println(result.toArray().toString());
        }
        List<List<Integer>> listresult = new ArrayList<>(result);
        for (int i = 0; i < N; i++) {
            System.out.println(listresult.get(i));
        }
        return null;
    }

}
