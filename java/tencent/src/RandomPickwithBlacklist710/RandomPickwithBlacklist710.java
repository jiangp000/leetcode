package src.RandomPickwithBlacklist710;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class RandomPickwithBlacklist710 {
    public static void main(String[] args) {
        Solution test = new Solution(1,null);
        test.pick();
    }
}


class Solution {
    private int[] arr ;
    private int N;
    private HashMap<Integer,Integer> res;
    private Set<Integer> set;

    public Solution(int N, int[] blacklist) {
        set = new HashSet<>();
        this.N = N;
        this.arr = blacklist;
        res = new HashMap<>();
        if(arr == null){
        }
        else {
            for (int i = 0; i < arr.length; i++) {
                set.add(arr[i]);
            }
        }


        if(arr == null) {
            int j = 0;
            int index = 0;
            // 要把 i 映射为 index
            for (int i = 0; i < N; i++) {
                // 判断 index 是否在数组里面
                while (set.contains(index)) {
                    index++;
                }
                res.put(i, index);
                index++;
            }
            System.out.println(Math.random() * (N));
        }
        else {
            int j = 0;
            int index = 0;
            // 要把 i 映射为 index
            if (arr != null) {
                for (int i = 0; i < N - arr.length; i++) {
                    // 判断 index 是否在数组里面
                    while (set.contains(index)) {
                        index++;
                    }
                    res.put(i, index);
                    index++;
                }
            }
        }
    }
//    腾讯面试的时候出这个题目，我没有做出来
//    一共有 N 个数字，要屏蔽掉 arr.length 个数字，那就说明 有 N - arr.length 个数字是可以的
//    那就在 N - arr.length 中进行匹配，再进行映射
//    0 -> 0
//    1 -> 1
//    2 -> 3




    public int pick() {
        if(arr == null) {
            return res.get((int)(Math.random() * (N)));
        }
        else {

            return res.get((int)(Math.random() * (N - arr.length)));
        }

    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(N, blacklist);
 * int param_1 = obj.pick();
 */