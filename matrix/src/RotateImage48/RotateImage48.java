package RotateImage48;

public class RotateImage48 {
}

//  我们可以旋转两次，第一次将上下调换一下，第二次按照对角线进行调换

class Solution {
    public void rotate(int[][] matrix) {
        int i = 0, j = matrix.length - 1;
        while(i < j){
           for(int k = 0; k < matrix[0].length; k++){
               int temp = matrix[i][k];
               matrix[i][k] = matrix[j][k];
               matrix[j][k] = temp;
           }
           i++;
           j--;
        }


        // 我们按照对角线进行调换
        for(int m = 0; m < matrix.length; m++){
            for(int n = 0; n < m; n++){
                int temp = matrix[m][n];
                matrix[m][n] = matrix[n][m] ;
                matrix[n][m] = temp;
            }
        }



    }
}

//1 2 3
//4 5 6
//7 8 9
//
//
//7 8 9
//4 5 6
//1 2 3


//7 4 1 1
//8 5 2 2
//9 6 3 3
//4 5 6 7
// 怎么将这个数字转化倒转过来呢 ？？？？？？

//[1][0] = 多少呢？？？  n[0][1]????



// 按照对角线 进行区分
