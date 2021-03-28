package Searcha2DMatrix74;

public class Searcha2DMatrix74 {
}


// 我们从左下角开始搜索
// 3 比20小，所以我们会向上，
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = matrix.length - 1, j = 0;
        while(i >= 0 && j < matrix[0].length){
            if(matrix[i][j] > target){
                i--;
            }
            else  if(matrix[i][j] == target){
                return true;
            }
            else{
                j++;
            }
        }
        return  false;

    }
}