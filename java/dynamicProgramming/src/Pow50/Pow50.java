package Pow50;

public class Pow50 {
}

// 4 ^8 = 4 ^4  4 ^2 4
class Solution {
    private double quickmul(double x, long N){
        if(N == 0) return 1.0;
        double temp = quickmul(x,N/2);
        return N % 2 == 0 ? temp * temp : temp * temp * x;

    }
    public double myPow(double x, int n) {
        long N = n;
        return  N >= 0 ? quickmul(x,N): 1.0;


    }

}