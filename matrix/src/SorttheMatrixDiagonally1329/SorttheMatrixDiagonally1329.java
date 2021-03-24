package SorttheMatrixDiagonally1329;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SorttheMatrixDiagonally1329 {
    public static void main(String[] args) {
        int[][] my = {
                {3,3,1,1},
                {2,2,1,2},
                {1,1,1,2},
                {1,2,3,4}
        };
        new Solution().diagonalSort(my);
    }
}


class dalaoSolution{
    public int[][] diagonalSort(int[][] mat) {
        for(int i = 0; i < Math.min(mat.length,mat[0].length);i++){
            for(int j = 0; j < mat.length - 1; j++){
                for(int k = 0; k < mat.length - 1; k++){
                    if(mat[j][k] > mat[j + 1][k + 1]){
                        int temp = mat[j][k];
                        mat[j][k] = mat[k][j];
                        mat[k][j] = temp;
                    }
                }
            }
        }
        return  mat;
    }
}


class Solution {
    public  void print(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
    public int[][] diagonalSort(int[][] mat) {
        int lenNum = mat.length - 1, colNum = mat[0].length - 1;

        int i = 0;
        for(int j = colNum; j >= 0; j--){
            int myI = i, myJ = j;
            List<Integer> res = new ArrayList();
            while(i <= lenNum && j <= colNum){
                res.add(mat[i][j]);
                i++;
                j++;
            }
            i = myI;
            j = myJ;
            Collections.sort(res);
            for(int k = 0;k < res.size(); k++){
                mat[myI][myJ] = res.get(k);
                myI++;
                myJ++;
            }
            print(mat);
        }

        // 我们把右上角的搞定了，现在还剩下下面的一些

        int m = 0;
        for(int n = 1; n <= lenNum; n++){
            int myN = n, myM = m;
            List<Integer> res = new ArrayList();
            while(n <= lenNum && m <= colNum){
                res.add(mat[n][m]);
                n++;
                m++;
            }
            n = myN;
            m = myM;
            Collections.sort(res);
            for(int k = 0;k < res.size(); k++){
                mat[myN][myM] = res.get(k);
                myN++;
                myM++;
            }
            print(mat);
        }

        return  null;
    }
}