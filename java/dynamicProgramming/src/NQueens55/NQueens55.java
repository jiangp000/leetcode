package NQueens55;

import java.util.ArrayList;
import java.util.List;

public class NQueens55 {
}


// N 皇后问题
// 这
class Solution {
    public List<List<String>> solveNQueens(int n) {
        int[] record = new  int[n];
        List<List<String>> result = new ArrayList<>();
        process(0,record,n, result);
        return  result;
    }
    public  List<String> getList(int[] arr){
        List<String> result = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            StringBuilder temp = new StringBuilder();
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == j) temp.append("Q");
                else temp.append(".");
            }
            result.add(temp.toString());
        }
        return  result;
    }
//     record[K] 表示 上面几行的 列数  ，如果行数和 列数相同
    public boolean isValid(int[] record,int i, int j){
        for(int k = 0; k < i; k++){
            if(j == record[k] || Math.abs(record[k] - j) == Math.abs(i - k)) return  false;
        }
        return  true;
    }

    public void process(int i, int[] record, int n,List<List<String>> result){
//        说明是最后一个了，此时record 已经满了
        if(i == n){
            List<String> temp = getList(record);
            result.add(temp);
            return;
        }
        int res = 0;
        for(int j = 0; j < n; j++){
            if(isValid(record,i,j)){
                record[i] = j;
                process(i + 1,record,n,result);
            }
        }
        return ;
    }
}