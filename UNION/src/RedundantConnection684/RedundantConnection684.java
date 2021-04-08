package RedundantConnection684;

import unionFind.UF;

import java.util.Arrays;

public class RedundantConnection684 {
    public static void main(String[] args) {
        Solution test = new Solution();
        int[][] edges = {{1,2},{1,3},{2,3}};
        System.out.println(Arrays.toString(test.findRedundantConnection(edges)));
    }
}



class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        for(int i = edges.length - 1; i >= 0; i--){
            UF uf = new UF(edges.length + 1);
            for(int j = 0; j < i; j++){
                if(uf.connected(edges[j][0],edges[j][1])) continue;
                uf.union(edges[j][0],edges[j][1]);
            }
            if(uf.connected(edges[i][0],edges[i][1])) return edges[i];
        }

        return null;

    }
}
