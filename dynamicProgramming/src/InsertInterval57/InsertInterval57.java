package InsertInterval57;

public class InsertInterval57 {
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
        // intervals 至少有一个
        // 把他放置在合适的位置
        int Q = 0;
        for(int i=0;i<intervals.length;i++){
            if(isTrue(newInterval[0],newInterval[1],intervals[i][0],intervals[i][1])){
                Q = 1;
                int begin = Math.min(newInterval[0],intervals[i][0]);
                int end   = Math.max(newInterval[1],intervals[i][1]);
                intervals[i] =new int[]{begin,end};
            }
        }
        return null;


    }
}