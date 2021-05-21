package MovingStonesUntilConsecutive1033;

import java.util.Arrays;

public class MovingStonesUntilConsecutive1033 {
}



// a b c 的大小关系
// 如果说 c - a == 2，则没有办法移动，因为已经OK 了
// 如果说 a，c任意和b差值小于等于 2， 则可以一步到位，否则至少两部
// 最多移动的步数 是 c - a - 2
class Solution {
    public int[] numMovesStones(int a, int b, int c) {
        int[] temp = new int[]{a,b,c};
        Arrays.sort(temp);
        a = temp[0];
        b = temp[1];
        c = temp[2];

        if(c - a == 2) return new int[]{0,0};
        if (b - a <= 2 || c - b <= 2) return new int[]{1,c - a - 2};
        return new int[]{2,c - a - 2};

    }
}