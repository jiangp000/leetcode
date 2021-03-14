package Triangle120;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Triangle120 {
    public static void main(String[] args) {

    }

}


// 我可以不适用额外的空间，来进行计算

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(triangle.get(0));
        for (int i = 1; i < triangle.size(); i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(triangle.get(i - 1).get(0) + triangle.get(i).get(0));
            for (int j = 1; j < i; j++) {
                int min = Math.min(triangle.get(i - 1).get(j - 1),triangle.get(i - 1).get(j));
                temp.add(min + triangle.get(i).get(j));
            }
            temp.add(triangle.get(i - 1).get(i - 1) + triangle.get(i).get(i));
            result.add(temp);
        }
        for(int i = 0; i < result.size(); i++){
            System.out.println(result.get(i));
        }
        List<Integer> lastRow = result.get(result.size() - 1);
        return Collections.max(lastRow);
    }
}