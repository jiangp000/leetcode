package SmallestSubsequenceofDistinctCharacters1081;

import java.util.Arrays;
import java.util.HashMap;

public class SmallestSubsequenceofDistinctCharacters {
    public static void main(String[] args){
        Solution test=new Solution();
        String s="bcabc";
        String s1="cbacdcbc";
        System.out.println(test.smallestSubsequence(s1));
    }
}


class Solution {

    public String getnext(Object[] arr,HashMap<String,Integer> count){
        for(int i=0;i<arr.length;i++){
            if(count.get((String) arr[i]) !=0 ) return (String)arr[i];
        }
        return null;
    }
    public String smallestSubsequence(String s) {
        if(s.length() ==1 ) return  s;
        String result ="";
        HashMap<String,Integer> count=new HashMap<>();
        for(int i = 0; i<s.length();i++){
            if(count.containsKey(s.charAt(i)+"")){
                count.put(s.charAt(i)+"",count.get(s.charAt(i)+"")+1);
            }
            else{
                count.put(s.charAt(i)+"",1);
            }
        }

        Object[] key_arr=count.keySet().toArray();
        Arrays.sort(key_arr);

        for(Object key:key_arr){
            System.out.println("key : "+key+"   value: "+count.get(key));
        }
        // 如果value =1 ，那么就必须要进行，按照字母顺序，兼顾 value

        int n=0;
        String required=(String) key_arr[0];
        for(int i=0;i<s.length();i++){
            if(count.get(s.charAt(i)+"")>1){
            // 看是否是排在前面的，如果是排在前面的，就进行
                if(required.equals(s.charAt(i)+"")){
                    result+=s.charAt(i);
                    count.put(s.charAt(i)+"",0);
                    required=getnext(key_arr,count);
                }
                else{
                    count.put(s.charAt(i)+"",count.get(s.charAt(i)+"")-1);
                }
            }
            // 此时是 不得不选的那种
            else{
                result+=s.charAt(i);
                required=getnext(key_arr,count);
                count.put(s.charAt(i)+"",0);
            }
        }
        return result;

    }
}