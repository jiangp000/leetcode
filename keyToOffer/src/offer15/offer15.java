package offer15;

public class offer15 {
}
class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {
            res = res + (n & 1);
            n = n >>> 1;
        }
        return res;
    }
}