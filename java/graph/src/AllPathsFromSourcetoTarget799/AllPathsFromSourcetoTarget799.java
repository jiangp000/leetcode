package AllPathsFromSourcetoTarget799;

import java.util.ArrayList;
import java.util.List;

public class AllPathsFromSourcetoTarget799 {
}
class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        return  backTrace(graph,0);

    }
    public List<List<Integer>> backTrace(int[][] graph, int node){
        List<List<Integer>> res = new ArrayList<>();
        if(node == graph.length - 1){
            List<Integer> path = new ArrayList<>();
            path.add(graph.length - 1);
            res.add(path);
            return res;
        }
        for(int nei : graph[node]){
            for(List<Integer> path:backTrace(graph,nei)){
                path.add(0,node);
                res.add(path);

            }
        }
        return res;

    }
}