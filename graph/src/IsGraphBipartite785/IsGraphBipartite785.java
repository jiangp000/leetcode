package IsGraphBipartite785;

import java.util.Arrays;

public class IsGraphBipartite785 {
}


class Solution {
    private int[] color;
    private static final int UNCOLORED = 0;
    private static final int RED = 1;
    private static final int GREEN = 2;
    private boolean valid;
    public boolean isBipartite(int[][] graph) {
        color = new int[graph.length];
        valid = true;
        Arrays.fill(color,UNCOLORED);
        for(int i = 0; i < graph.length && valid; i++){
            if(color[i] == UNCOLORED){
                dfs(i,RED,graph);
            }
        }
        return valid;
    }
    public void dfs(int node, int c, int[][] graph){
        color[node] = c;
        int cNei = c == RED ? GREEN : RED;
        for(int negihbour : graph[node]){
            if(color[negihbour] == UNCOLORED) {
                dfs(negihbour, cNei, graph);
                if (!valid) return;
            }
            else if(color[negihbour] != cNei){
                valid = false;
                return ;
            }
        }
    }
}