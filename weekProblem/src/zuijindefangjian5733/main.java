package zuijindefangjian5733;

import java.util.*;

public class main {
}

// 是一个查询，查询哪些数字比最小的要求还要大，返回他的下标
// 对value 进行排序，使用hashmap，但是hashmap是没有顺序的哈，使用linkedlist

class Solution {
    // 记录哪些数字对应着哪些下标
    private HashMap<Integer, ArrayList<Integer>>  res;
    private LinkedList<Integer> minSize;
    private  int[] result;
    public void find(int index,int perfer){
        for(;index < minSize.size(); index++){
            List<Integer> list = res.get(minSize.get(index));
        }
    }
    public int[] closestRoom(int[][] rooms, int[][] queries) {
        result = new int[queries.length];
        res = new HashMap<>();
        minSize = new LinkedList<>();
        for(int i = 0; i < rooms.length; i++){
            minSize.add(rooms[i][1]);
            // 把最小的给他弄进去
            if(res.containsKey(rooms[i][1])){
                res.get(rooms[i][1]).add(i);
            }
            else{
                res.put(rooms[i][1],new ArrayList<>(i));
            }
        }
        Collections.sort(minSize);
        return null;
        //找到一个最合适的
        // 现在开始进行查询
//        for(int i = 0; i < queries.length; i++){
//            int index = minSize.indexOf(queries[i][1]);
//            // 这是能够满足的最基本的条件
//            // 从index之后，都是满足最小的最小的条件的
//            find(s)
//
//        }
    }
}