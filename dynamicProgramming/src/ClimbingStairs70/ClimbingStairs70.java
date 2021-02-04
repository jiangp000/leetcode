package ClimbingStairs70;

public class ClimbingStairs70 {
    public static void main(String[] args) {

    }
}


class Solution {
    public int climbStairs(int n) {
        int[] result =new int[46];
        result[1]=1;
        result[2]=2;
        for(int i=3;i<46;i++){
            result[i]=result[i-1]+result[i-2];
        }
        return result[n];

    }
}