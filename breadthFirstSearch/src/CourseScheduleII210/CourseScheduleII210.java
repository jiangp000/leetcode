package CourseScheduleII210;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CourseScheduleII210 {
    public static void main(String[] args) {
        int i = 2;
        int[][] res = {{1,0}};
        int[] temp = new Solution().findOrder(i,res);
        System.out.println(Arrays.toString(temp));
    }
}


class Solution {
    boolean valid;
    int[] result;
    int index;

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        valid = true;
        result = new int[numCourses];
        index = numCourses - 1;
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            res.add(new ArrayList<>());
        }

        for (int i = 0; i < prerequisites.length; i++) {
            res.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        // 现在已经都记录完了
        // 从第一个课程开始看起
        int[] visited = new int[numCourses];
        for (int i = 0; i < numCourses  && valid; i++) {
            if (visited[i] == 0) {
                dfs(i, visited, res);
            }
        }
        if(!valid) return new int[0];

        return result;
    }

    public void dfs(int i, int[] visited, List<List<Integer>> res) {
        visited[i] = 1;
        for (int j = 0; j < res.get(i).size(); j++) {
            if (visited[res.get(i).get(j)] == 0) {
                dfs(res.get(i).get(j), visited, res);
                if (!valid) return;
            } else if (visited[i] == 1) {
                valid = false;
                return;
            }
        }
        visited[i] = 2;
        result[index] = i;
        index--;
    }
}