package EvaluateReversePolishNotation150;

import java.util.Arrays;
import java.util.Stack;

public class EvaluateReversePolishNotation150 {
}


class Solution {
    // 遇到数字，就进栈
    // 遇到运算符，就弹出两个出来，+ - * / 都是双目运算符

    public int getRes(int num1, int num2, String s){
        if("+".equals(s)){
            return  num1 + num2;
        }
        else if("-".equals(s)){
            return  num1 - num2;
        }
        else if("*".equals(s)){
            return  num1 * num2;
        }
        else if("/".equals(s)){
            return  num1 / num2;
        }

        return  0;
    }
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for(int i = 0; i < tokens.length; i++){
            if("+".equals(tokens[i]) || "-".equals(tokens[i]) || "*".equals(tokens[i]) || "/".equals(tokens[i])){
                int num1 = Integer.valueOf(stack.pop());
                int num2 = Integer.valueOf(stack.pop());
                int result = getRes(num1,num2,tokens[i]);
                stack.push(""+result);
            }
            else{
                stack.push(tokens[i]);
            }
        }

        return Integer.valueOf(stack.pop());

    }
}