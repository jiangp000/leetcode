package UniquePathsII63;

public class UniquePathsII63 {
    public static void main(String[] args) {

    }
}


class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
//         定义暴力递归
//        return
        int[][] dp = new int[obstacleGrid.length + 1][obstacleGrid[0].length + 1];
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                dp[i][j] = -1;
            }
        }
        return  process(0,0,obstacleGrid.length,obstacleGrid[0].length,obstacleGrid,dp);

    }

    public int process(int row, int col, int lenRow, int colRow, int[][] map, int[][] dp){
        if(dp[row][col] != -1) return dp[row][col];
        if(map[row][col] == 1){
            dp[row][col] = 0;
            return 0;
        }
        if(row == lenRow - 1 && col == colRow - 1){
            dp[row][col] = 1;
            return 1;
        }
        if(row == lenRow - 1 ){
            dp[row][col]  = process(row , col +  1, lenRow,colRow,map,dp);
            return  dp[row][col];
        }
        if(col == colRow - 1 ){
            dp[row][col] = process(row + 1,col,lenRow,colRow,map,dp);
            return  dp[col][col];
        }
        dp[row][col] = process(row + 1,col,lenRow,colRow,map,dp) + process(row,col + 1,lenRow,colRow,map,dp);
        return  dp[row][col];
    }
}