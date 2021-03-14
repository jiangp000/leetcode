package MinimumLengthofStringAfterDeletingSimilarEnds1750;

public class MinimumLengthofStringAfterDeletingSimilarEnds1750 {
    public static void main(String[] args) {
        Solution test = new Solution();
        String a = "abaaba";
        System.out.println(test.minimumLength(a));
    }
}


//输入：s = "cabaabac"
//        输出：0
//        解释：最优操作序列为：
//        - 选择前缀 "c" 和后缀 "c" 并删除它们，得到 s = "abaaba" 。
//        - 选择前缀 "a" 和后缀 "a" 并删除它们，得到 s = "baab" 。
//        - 选择前缀 "b" 和后缀 "b" 并删除它们，得到 s = "aa" 。
//        - 选择前缀 "a" 和后缀 "a" 并删除它们，得到 s = "" 。
class Solution {
    public int minimumLength(String s) {
        if(s == null) return 0;
        if(s.length() < 2) return s.length();
        char start = s.charAt(0), end = s.charAt(s.length() - 1);
        if(start != end) return  s.length();
        int i = 1, j = s.length() - 2;
        while(i < s.length() && s.charAt(i) == start){
            i++;
        }

        while(j >= 0 && s.charAt(j) == end){
            j--;
        }
        j++;
        if(i < j) return minimumLength(s.substring(i,j));
        return  0;
    }
}