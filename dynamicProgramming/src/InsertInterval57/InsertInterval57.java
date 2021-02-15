package InsertInterval57;

import java.util.Arrays;
import java.util.Comparator;

public class InsertInterval57 {
    public static void main(String[] args) {
        Solution test = new Solution();
        int[][] result={{1,3},{6,9}};
        int[] newinter = {2,5};
        System.out.println(test.insert(result,newinter));
    }
}


class Solution {
    public  boolean isTrue(int a0,int a1,int b0,int b1){
        if((a0 >= b0 && a0 <=b1) || (a1 >= b0 && a1 <=b1)
                ||(b0 >= a0 && b0 <=a1)||(b1 >= a0 && b1 <=a1) ) return true;
        return false;
    }
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if(intervals.length ==0) {
            int[][] result = new int[1][];
            result[0] =newInterval;
            return  result;
        }

        int[][] result = new int[intervals.length + 1][];
        for(int i = 0; i < intervals.length; i++ ){
            result[i] = intervals[i];
        }
        result[result.length - 1] = newInterval;
        Arrays.sort(result, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]) return o1[1] - o2[1];
                return o1[0] - o2[0];
            }
        });
        // 我们得到了排序好的结果

        for(int i = 0; i < result.length - 1;i++){
            if(isTrue(result[i][0],result[i][1],result[i+1][0],result[i+1][1])){
                int begin = Math.min(result[i][0],result[i+1][0]);
                int end   = Math.max(result[i][1],result[i+1][1]);
                result[i+1][0] = begin;
                result[i+1][1] = end;
                result[i][0] = -1;
                result[i][1] = -1;
            }
        }
        int lenRes = 0;
        for(int i = 0; i <result.length; i++){
            if(result[i][0] == -1 && result[i][1] == -1){
            }
            else{
                lenRes++;
            }
        }
        int[][] result999 = new int[lenRes][];
        int temp =0;
        for(int i = 0; i <result.length; i++){
            if(result[i][0] == -1 && result[i][1] == -1){
            }
            else{
                result999[temp] = result[i];
                System.out.println(Arrays.toString(result999[temp]));
                temp ++;
            }
        }

        return  result999;


    }
}