package NQueens51;


import java.util.ArrayList;
import java.util.List;

//
public class NQueens51 {
    public static void main(String[] args) {
        new Solution().solveNQueens(9);

    }



}


class Solution {
    public List<List<String>> solveNQueens(int n) {
        int [] res = new int[n];
        List<List<String>> result = new ArrayList<>();
        process(0,n,res,result);
        for(int i = 0; i < result.size(); i++){
            System.out.println(result.get(i));
        }
        return result;
    }
    public boolean isValid(int start, int i, int[] res){
        for(int k = 0; k < start; k++){
//            纵向的   对角线上的
            if(res[k] == i || Math.abs(k - start) == Math.abs(i - res[k])) return  false;
        }
        return true;
    }
    public List<String> getList(int[] res){
        List<String> result = new ArrayList<>();
        for(int i = 0; i < res.length; i++){
            StringBuilder temp = new StringBuilder();
            for(int j = 0; j < res.length; j++){
                if(res[i] == j) temp.append("Q");
                else  temp.append(".");
            }
            result.add(temp.toString());
        }

        return result;

    }

    // 使用回溯算法，暴力穷举
    public void process(int start, int n, int[] res,List<List<String>> result){
        if(start == n){
            List<String>  temp = getList(res);
            result.add(temp);
            return;
        }
        for(int i = 0; i < n; i++){
            if(isValid(start,i,res)){
                res[start] = i;
                process(start + 1,n,res,result);
            }
        }

    }
}