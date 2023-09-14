package MinimumWindowSubstring76;

import java.util.HashMap;


//Input: s = "ADOBECODEBANC", t = "ABC"
//        Output: "BANC"
public class MinimumWindowSubstring76 {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String s1 = "a";
        String t1 = "a";
        String s2 = "aa";
        String t2 = "aa";
        Solution test = new Solution();
        System.out.println(test.minWindow(s2,t2));

    }
}
// 用hashmap 来对t 中的元素进行计数
// 每次遇到一个，那么count ++
// 直到size ==LEN 此时已经包含了所有的元素
// 然后让 hashmap的计算减少一个，如果仍然 > 0，此时说明还可以进行，只需要 i ++
// 然后让 hashmap的和计算减少一个，如果==0 size --，让 i++,j ++

class Solution {
    public HashMap<String,Integer> getMap(String t){
        HashMap<String,Integer> result = new HashMap<>();
        for(int i = 0; i < t.length(); i++){
            result.put(t.charAt(i) +"",0);
        }
        return result;
    }
    public String minWindow(String s, String t) {
        HashMap<String,Integer> tMap = getMap(t);
        int i = 0, j = 0, len = 0,res = Integer.MAX_VALUE;
        int[] resIndex = new int[2];
        while(j < s.length() + 1){
            if(len == t.length()){
                if(j - i < res){
                    res = j - i;
                    resIndex[0] = i;
                    resIndex[1] = j;
                }
                // 滑动窗口整体向前前进一个格子
                if(tMap.containsKey(s.charAt(i)+"")) {
                    tMap.put(s.charAt(i) + "", tMap.get(s.charAt(i) + "") - 1);
                    if (tMap.get(s.charAt(i) + "") == 0) {
                        len--;
                    }
                    i ++;
                    continue;
                }
                // 如果不包含，说明直接不影响
                else{
                    i++;
                    continue;
                }
            }
            // 此时判断每一个字符是不是在t 中
            if(j == s.length()) break;
            if(tMap.containsKey(s.charAt(j)+"")){
                if(tMap.get(s.charAt(j)+"") == 0){
                    len ++;
                    tMap.put(s.charAt(j) +"",1);
                }
                else{
                    tMap.put(s.charAt(j)+"",tMap.get(s.charAt(j)+"") + 1);
                }
            }
            j ++;
        }
        if(res == Integer.MAX_VALUE) return  "";
        return s.substring(resIndex[0],resIndex[1]);
    }
}