package NumberofIslands200;

public class MaxAreaofIsland695 {
}


class Solution {
    static int[] x = {0,0,-1,1};
    static int[] y = {1,-1,0,0};

    public int numIslands(char[][] grid) {
        int[][] visited = new int[grid.length][grid[0].length];
        int res = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1' && visited[i][j] == 0){
                    // 我们可以对其进行宽度优先搜索
                    bfs(i,j,visited,grid);
                    res += 1;
                }
            }
        }
        return res;


    }

    public void bfs(int i,int j, int[][] visited,char[][] grid){
        visited[i][j] = 1;
        for(int k = 0; k < 4; k++){
            int dx = i + x[k];
            int dy = j + y[k];
            if (dx >= 0 && dx < grid.length && dy >= 0 && dy < grid[0].length && visited[dx][dy] == 0 && grid[dx][dy] == '1') {
                bfs(dx,dy,visited,grid);
            }
        }
    }
}