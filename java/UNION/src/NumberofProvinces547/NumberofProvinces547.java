package NumberofProvinces547;

import unionFind.UF;

public class NumberofProvinces547 {
    public static void main(String[] args) {
        Solution test = new Solution();
        int[][] arr = {{1,0,0},{0,1,0},{0,0,1}};
        System.out.println(test.findCircleNum(arr));
    }
}



class Solution {
    public int findCircleNum(int[][] isConnected) {
        UF uf = new UF(isConnected.length);
        for(int i = 0; i < isConnected.length; i++){
            for(int j = 0; j < isConnected[0].length; j++){
                if(isConnected[i][j] == 1 && i != j){
                    if(uf.connected(i,j));
                    else{
                        uf.union(i,j);
                    }
                }
            }
        }

        return  uf.count();

    }
}