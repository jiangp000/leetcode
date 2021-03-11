package MinimumPathSum64;

import java.util.Arrays;

public class MinimumPathSum64 {
}



class Solution {

    public int minPathSum(int[][] grid) {
        int[][] result = new int[grid.length][grid[0].length];
        result[0][0] = grid[0][0];
        for (int i = 1; i < grid.length; i++) {
            result[i][0] = result[i-1][0] + grid[i][0];
        }
        for(int j = 1; j < grid[0].length; j++){
            result[0][j] = result[0][j-1]+grid[0][j];
        }
        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[0].length; j++) {
                int temp = result[i][j - 1];
                if (temp > result[i - 1][j]) temp = result[i - 1][j];
                result[i][j] = grid[i][j] + temp;

                System.out.println(result[i][j]);
            }
        }
        return result[result.length - 1][result[0].length - 1];
    }

}