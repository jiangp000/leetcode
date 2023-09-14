package ValidAnagram242;

import java.util.Arrays;

public class ValidAnagram242 {
}
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        System.out.println(s1.toString());
        System.out.println(t1.toString());
       return Arrays.equals(s1,t1);
    }
}