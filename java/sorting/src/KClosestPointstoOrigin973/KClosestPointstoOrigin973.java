package KClosestPointstoOrigin973;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class KClosestPointstoOrigin973
{
}


class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] res = new int[k][2];
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] * o1[0] + o1[1] * o1[1] - o2[0] * o2[0] - o2[1] * o2[1];
             }
        });
        for(int i = 0; i < points.length; i++ ){
            System.out.println(Arrays.toString(points[i]));
        }

        return Arrays.copyOfRange(points,0,k);


    }
}