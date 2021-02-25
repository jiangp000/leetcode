package GetKthMagicNumberLCCI1709;

public class GetKthMagicNumberLCCI1709 {
    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(test.getKthMagicNumber(5));
    }
}
class Solution {
    public int getKthMagicNumber(int k) {
        int[] result = new int[k + 1];
        result[0] = 1;
        int p3 = 0, p5 = 0, p7 = 0;
        int i = 1;
        for (; i < k; i++) {
            result[i] = Math.min(Math.min(result[p3] * 3, result[p5] * 5), result[p7] * 7);
            if (result[i] == result[p3] * 3) p3++;
            if (result[i] == result[p5] * 5) p5++;
            if (result[i] == result[p7] * 7) p7++;
        }
        return result[k - 1];
    }
}