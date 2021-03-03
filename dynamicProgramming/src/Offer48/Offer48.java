package Offer48;

import java.util.HashMap;

public class Offer48 {
    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(test.lengthOfLongestSubstring("ab"));
    }
}

// 我们使用hashmap来实现，如果遇到了重复的字符串，那么我们就将位置跳到该字符串所在的位置上

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0 ) return 0;
        if(s.length() == 1) return 1;
        int i = 0, j = 0, res = 0;
        HashMap<String,Integer> subMap = new HashMap<>();
        while(j < s.length() + 1 ){
            // 如果包含了，那么就说明要把前面的统统删除掉，
            if(j == s.length()) res =Math.max(res,j - i);
            if(subMap.containsKey(s.charAt(j)+"")){
                res = Math.max(res,j - i );
                int nextIndex = subMap.get(s.charAt(j)+"");
                for(int k = i; k < nextIndex + 1 ; k++){
                    subMap.remove(s.charAt(k)+"");
                }
                subMap.put(s.charAt(j)+"",j);
                //此时hashmap 中已经删除完了 ，让 i = nextIndex + 1
                i = nextIndex + 1;
                j++;
            }
            // 如果没有包含，那就直接加上去
            else{
                subMap.put(s.charAt(j)+"",j);
                j ++;
            }
        }
        return res;

    }
}