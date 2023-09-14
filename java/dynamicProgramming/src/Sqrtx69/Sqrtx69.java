package Sqrtx69;

public class Sqrtx69 {
    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(test.mySqrt(1));
        System.out.println(46341 * 46341);
    }
}
//  根号x = (e^ lnx)^0.5 = e ^ (0.5 ln x) =answer   answer + 1
class Solution {
    public int mySqrt(int x) {
        if(x == 0) return  0;
        int answer = (int) Math.exp(0.5 * Math.log(x));
        return  (long) (answer + 1) * (answer + 1) <= x ? answer + 1 : answer;

    }
}