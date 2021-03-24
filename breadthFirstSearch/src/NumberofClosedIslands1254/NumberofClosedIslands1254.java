package NumberofClosedIslands1254;


// 我们把外边的1 设置为0，然后就变成了统计岛屿的数量的问题
public class NumberofClosedIslands1254 {

}

class Solution {
    static int[] x = {0,0,1,-1};
    static int[] y = {1,-1,0,0};
    public int closedIsland(int[][] grid) {
        int[][] visited = new int[grid.length][grid[0].length];
        for(int j = 0; j < grid[0].length; j++){
            if(grid[0][j] == 0 && visited [0][j] == 0 ){
                bfs(0,j,visited,grid);
            }
            if(grid[grid.length -1][j] == 0 && visited[grid.length - 1][j] ==0){
                bfs(grid.length - 1,  j, visited,grid);
            }
        }

        for(int i = 0; i < grid.length; i++){
            if(grid[i][0] == 0 && visited [i][0]  == 0 ){
                bfs(i,0,visited,grid);
            }
            if(grid[i][grid[0].length - 1] == 0 && visited[i][grid[0].length - 1] ==0){
                bfs(i, grid[0].length - 1, visited,grid);
            }
        }
        // 现在就相当于是 看里面的数量了 嘿嘿嘿

        int res = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(visited[i][j] == 0 && grid[i][j] == 0){
                    bfs(i,j,visited,grid);
                    res += 1;
                }
            }
        }
        return res;
    }

    public void bfs(int i ,int j, int[][] visited, int[][] grid){
        visited[i][j] = 1;
        for(int k = 0; k < 4; k++){
            int dx = i + x[k];
            int dy = j + y[k];
            if(dx >= 0 && dy >= 0 && dx < grid.length && dy < grid[0].length && visited[dx][dy] ==0 && grid[dx][dy] == 0){
                bfs(dx,dy,visited,grid);
            }
        }
        // 他们的visited 都设置为1 了，其实也不用了
    }
}