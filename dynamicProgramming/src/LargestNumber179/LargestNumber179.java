package LargestNumber179;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber179 {
    public static void main(String[] args) {
        String q = "00000";
        System.out.println(Integer.valueOf(q) == 0);
    }

}

//  3 30
class Solution {
    public String largestNumber(int[] nums) {
        String[] data = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            data[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(data, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String temp1 = o1 + o2;
                String temp2 = o2 + o1;
                return temp2.compareTo(temp1);
            }
        });
        String result = "";
        for (String str : data) {
            System.out.println(str);
            result += str;
        }
        for(int i = 0; i < result.length(); i++){
            if(result.charAt(i) != '0')  return  result;
        }
        return "0";
    }


}