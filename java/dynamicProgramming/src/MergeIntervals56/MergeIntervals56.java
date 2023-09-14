package MergeIntervals56;

import java.util.Arrays;

public class MergeIntervals56 {
    public static void main(String[] args) {
        Solution test = new Solution();
        int[][] s={{1,3},{2,6},{8,10},{15,18}};
        test.merge(s);
    }
}


class Solution {
    public  boolean isTrue(int a0,int a1,int b0,int b1){
        if((a0 >= b0 && a0 <=b1) || (a1 >= b0 && a1 <=b1)
            ||(b0 >= a0 && b0 <=a1)||(b1 >= a0 && b1 <=a1) ) return true;
        return false;
    }
    public int[][] merge(int[][] intervals) {
        if(intervals.length == 1) return intervals;
        for(int i =0;i < intervals.length -1 ;i++){
            for(int j=i+1;j< intervals.length;j++){
                if(intervals[i][0] == -1 && intervals[i][1] == -1){
                    break;
                }
                // 这两个都还是有效的
                // 1 3 [2 4] 怎么判断
                if(isTrue(intervals[i][0],intervals[i][1],intervals[j][0],intervals[j][1])){
                    int begin = Math.min(intervals[i][0],intervals[j][0]);
                    int end   = Math.max(intervals[i][1],intervals[j][1]);
                    intervals[j][0] = begin;
                    intervals[j][1] = end;
                    intervals[i][0] = -1;
                    intervals[i][1] = -1;
                    break;
                }
            }
        }
        int result =0;
        for(int i = 0;i<intervals.length;i++){
            if(intervals[i][0] != -1 && intervals[i][1] != -1) result++;
            System.out.println(Arrays.toString(intervals[i]));
        }
        int[][] Q =new int[result][];
        int k=0;
        for(int i = 0;i<intervals.length;i++){
            if(intervals[i][0] != -1 && intervals[i][1] != -1) {
                Q[k] = intervals[i];
                k++;
            }
        }
        for(int i = 0;i<Q.length;i++){
            System.out.println(Arrays.toString(Q[i]));
        }
        return  Q;


    }
}