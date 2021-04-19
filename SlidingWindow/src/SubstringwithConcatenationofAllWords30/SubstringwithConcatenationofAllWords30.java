package SubstringwithConcatenationofAllWords30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubstringwithConcatenationofAllWords30 {
}

//输入：
//        s = "barfoothefoobarman",
//        words = ["foo","bar"]
//        输出：[0,9]
//        解释：
//        从索引 0 和 9 开始的子串分别是 "barfoo" 和 "foobar" 。
//        输出的顺序不重要, [9,0] 也是有效答案。
//
//        来源：力扣（LeetCode）
//        链接：https://leetcode-cn.com/problems/substring-with-concatenation-of-all-words
//        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
// 采用滑动窗口，字符串中至少要满足 所有的words
class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<>();
        if(words.length == 0) return res;
        int wordLen = words[0].length();
        HashMap<String,Integer> allWords = new HashMap<>();
        for(String temp : words){
            int value = allWords.getOrDefault(temp,0);
            allWords.put(temp,value + 1);
        }

        // 遍历所有的字串
        for(int i = 0; i < s.length() - words.length * wordLen + 1; i++){
            HashMap<String,Integer> hasWords = new HashMap<>();
            int num = 0;
            while(num < words.length){
                // 下一个可能出现的
                String word = s.substring(i + num * wordLen,i + (num + 1) * wordLen);
                if(allWords.containsKey(word)) {
                    int value = hasWords.getOrDefault(word, 0);
                    hasWords.put(word, value + 1);
                    if (hasWords.get(word) > allWords.get(word)) {
                        break;
                    }
                }
                else{
                    break;
                }
                num++;
            }
            if(num == words.length){
                res.add(i);
            }
        }
        return res;

    }
}