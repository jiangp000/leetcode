package RemoveDuplicateLetters316;

public class RemoveDuplicateLetters316 {
}




class Solution {
    public String removeDuplicateLetters(String s) {
        int[] num = new int[26];
        for(int i = 0; i < s.length(); i++){
            num[s.charAt(i) - 'a']++;
        }
        boolean[] visited = new boolean[26];
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(!visited[ch - 'a']){
                while(res.length() > 0 && res.charAt(res.length() - 1) > ch){

                    if(num[res.charAt(res.length() - 1) - 'a'] > 0) {
                        visited[res.charAt(res.length() - 1) - 'a'] = false;
                        res.deleteCharAt(res.length() - 1);
                    }
                    else{
                        break;
                    }
                }
                visited[ch - 'a'] = true;
                res.append(ch);
            }
            num[ch - 'a'] -= 1;
        }
        return res.toString();
    }
}