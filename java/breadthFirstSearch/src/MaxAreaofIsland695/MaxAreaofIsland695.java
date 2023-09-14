package MaxAreaofIsland695;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxAreaofIsland695 {
    public static void main(String[] args) {
    }

    // 一个正方形的周长为4，如果在他的旁边找到了一个正方形，那么他的周长就会减少1，再加上它找到的正方形

}




class Solution {
    static int[] x = {0,0,-1,1};
    static int[] y = {1,-1,0,0};

    public int maxAreaOfIsland(int[][] grid) {
        int[][] visited = new int[grid.length][grid[0].length];
        int res = 0;
        List<Integer> result = new ArrayList();
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1 && visited[i][j] == 0){
                    // 我们可以对其进行宽度优先搜索
                    int s = bfs(i,j,visited,grid);
                    result.add(s);
                    System.out.println(s);
                }
            }
        }
        if(result == null || result.size() == 0) return 0;
        return Collections.max(result);

    }

    public int bfs(int i,int j, int[][] visited,int[][] grid){
        visited[i][j] = 1;
        int res = 1;
        for(int k = 0; k < 4; k++){
            int dx = i + x[k];
            int dy = j + y[k];
            if (dx >= 0 && dx < grid.length && dy >= 0 && dy < grid[0].length && visited[dx][dy] == 0 && grid[dx][dy] == 1) {
                res += bfs(dx,dy,visited,grid);
            }
        }
        return res;
    }
}