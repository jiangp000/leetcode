package DivingBoardLCCI1611;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DivingBoardLCCI1611 {
    public static void main(String[] args) {
        new Solution().divingBoard(2 ,1118596 ,979);
    }
}

// 我觉得就是一个 for 循环
// set 是一个无序的，不能保证顺序
class Solution {
    public int[] divingBoard(int shorter, int longer, int k) {
        if(k == 0) return  new int[0];
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i <= k; i++){
            int j = k - i;
            System.out.println(shorter * i + longer * j);
            set.add(shorter * i + longer * j);
        }
        int[] res = new int[set.size()];
        // 使用迭代器，之前没有用够迭代器呢
        int index =  0;
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            res[index++] =(int) iterator.next();
        }
        Arrays.sort(res);

        return res;

    }
}