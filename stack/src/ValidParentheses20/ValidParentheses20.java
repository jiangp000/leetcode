package ValidParentheses20;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses20 {
}


class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 == 1) return  false;
        Stack<Character> stack = new Stack<>();
        HashMap<Character,Character> hashmap = new HashMap<>();
        hashmap.put(']','[');
        hashmap.put('}','{');
        hashmap.put(')','(');

        for(int i = 0; i < s.length(); i++){
            if(hashmap.containsKey(s.charAt(i))){
                if(stack.isEmpty() || stack.peek() != hashmap.get(s.charAt(i))) return  false;
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        if(! stack.isEmpty()) return  false;

        return  true;
    }
}