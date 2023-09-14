package RangeSumQueryImmutable303;

public class RangeSumQueryImmutable303 {
}


class NumArray {
    private int[] sums;
    // 1 2 3 4 5
    // 0,1,3,6,10,15


    public NumArray(int[] nums) {
        sums = new int[nums.length + 1];
        for(int i = 0; i < nums.length; i++){
            sums[i + 1] = sums[i] +nums[i];
        }
    }
    public int sumRange(int left, int right) {
        return sums[right + 1] - sums[left];

    }
}

