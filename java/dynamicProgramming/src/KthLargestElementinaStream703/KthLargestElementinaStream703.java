package KthLargestElementinaStream703;

import java.util.Arrays;
import java.util.Comparator;

public class KthLargestElementinaStream703 {
}

class KthLargest {
    private int[] data;
    private int k;

    public KthLargest(int k, int[] nums) {
        this.data = nums;
        this.k = k;
    }

    public int add(int val) {
        int[] result = new int[data.length + 1];
        System.arraycopy(this.data,0,result,0,this.data.length);
        result[result.length] = val;
        Arrays.sort(result);
        int j = 1;
        this.data = result;
        for(int i = result.length -1; i >= 0; i --){
            if(k == j){
                return result[i];
            }
            else{
                j ++;
            }
        }
        return 0;

    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */