package MinimumNumberofArrowstoBurstBalloons;

import java.util.Arrays;
import java.util.Comparator;

public class MinimumNumberofArrowstoBurstBalloons {
    public static void main(String[] args){
        Solution test=new Solution();
        int[][] Q={{2,3},{2,3}};
        int[][] P={{10,16},{2,8},{1,6},{7,12}};
        int[][] L={{-2147483646,-2147483645},{2147483646,2147483647}};
        System.out.println(test.findMinArrowShots(L));
    }
}


class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points==null || points.length ==0) return 0;
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] <o2[0]) return -1;
                return 1;
            }
        });

        for(int i=0;i<points.length;i++){
            for(int j=0;j<points[0].length;j++){
                System.out.print(points[i][j]+" ");
            }
            System.out.println();
        }

        int result=1,begin=points[0][0],end=points[0][1];
        for(int i=1;i<points.length;i++){
            if(points[i][0] <= end){
                begin=points[i][0];
                if(points[i][1] < end){
                    end=points[i][1];
                }
            }
            else{
                result++;
                begin=points[i][0];
                end=points[i][1];
            }
        }
        return result;

    }
}