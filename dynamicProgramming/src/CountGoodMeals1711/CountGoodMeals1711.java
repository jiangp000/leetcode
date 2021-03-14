package CountGoodMeals1711;

import java.util.HashMap;

public class CountGoodMeals1711 {
    public static void main(String[] args) {
        Solution  test = new Solution();
        int[] arr = {1,3,5,7,9};
        System.out.println(test.countPairs(arr));
    }
}


//  两个数字相加，是不是2的幂次方，如果是，那么就是大餐，如果不是，就不是
//  我们可以对每一个数字进行遍历，如果他们的幂次方减去这个数字存在，那么就是
//   如果我们进行完第一个数字的时候，我们就应该删除该数字，防止后面又来这个

// [1,1,1,3,3,3,7]

class Solution {
    public int countPairs(int[] deliciousness) {
        HashMap<Integer,Integer> data = new HashMap<>();
        long res = 0;
        for(int i = 0; i < deliciousness.length; i++){
            for(int j = 0; j < 22; j++){
                int t = (int) Math.pow(2,j) - deliciousness[i];
                if(t < 0) continue;
                // 我们需要查看这个 t 是否在数组中
                if(data.containsKey(t) )  res += data.get(t);
            }
            data.put(deliciousness[i],data.getOrDefault(deliciousness[i],0)+1);
        }
        System.out.println(res);

        res %=  (1e9 +7);
        return (int) res;
    }
}