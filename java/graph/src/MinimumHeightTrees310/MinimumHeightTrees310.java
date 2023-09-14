package MinimumHeightTrees310;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MinimumHeightTrees310 {
}


class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> res = new ArrayList<>();
        List<List<Integer>> map = new ArrayList<>();
        if(n <= 1){
            res.add(0);
            return res;
        }
        // 根节点的条件是从此节点开始，可以找到其他的 n - 1 条边
        for(int i = 0; i < n; i++){
            map.add(new ArrayList<>());
        }
        int[] degree = new int[n];
        // 建立各个节点的出度表，将从出度为 1 的进行向上搜索
        // 从底下向上面进行搜索
        for(int[] num : edges){
            degree[num[0]]++;
            degree[num[1]]++;
            map.get(num[0]).add(num[1]);
            map.get(num[1]).add(num[0]);
        }

        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < n; i++){
            if(degree[i] == 1){
                queue.offer(i);
            }
        }
        // 标准的 dfs 操作
        while(!queue.isEmpty()){
            res = new ArrayList<>();
            int size = queue.size();
            for(int i = 0; i < size; i++){
                int cur = queue.poll();
                res.add(cur);
                List<Integer> neighbours = map.get(cur);
                for(int neighbour : neighbours){
                    degree[neighbour]--;
                    if(degree[neighbour] == 1){
                        queue.offer(neighbour);
                    }
                }
            }
        }
        return res;


    }
}