package CourseSchedule207;


// 拓扑排序
// [[0,1],[2,3],[4,5]]
// 表示学习0之前，必须要学习1，学习2之前，必须要学习3，学习4之前必须要学习5
// 这种情况应该是可以的，
// 1：我们创建一个链表，记录，我们访问1之后，就可以访问哪些了？
// 2：如果这些没有被访问，那就可以继续进行
// 3：如果这个节点我们到的时候，就已经被访问过了，那就说明之前就已经被访问了，然后现在才能被访问，很明显就是出现环了


import java.util.ArrayList;
import java.util.List;

public class CourseSchedule207 {
    public static void main(String[] args) {
        int num = 2;
        int[][] Q = {{1,0},{0,1}};
        System.out.println(new Solution().canFinish(num,Q));
    }
}


class Solution {
    boolean valid = true;

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        valid = true;
        List<List<Integer>> temp = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            temp.add(new ArrayList<>());
        }
        for (int i = 0; i < prerequisites.length; i++) {
            temp.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        // 然后就进行 dfs
        int[] visited = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if(visited[i] != 1) {
                bfs(i, temp, visited);
            }
        }
        return valid;
    }

    public void bfs(int i, List<List<Integer>> temp, int[] visited) {
        visited[i] = 1;
        if(temp.get(i) == null) return;
        for(int j = 0; j < temp.get(i).size(); j++){
            // 如果是之前访问过的，就直接是false，被访问了两边，很明显是有环的
            if(visited[temp.get(i).get(j)] == 1){
                valid = false;
                return ;
            }
            // 如果是之前没有访问过，就进行bfs，返回valid
            else if(visited[temp.get(i).get(j)] ==0){
                bfs(temp.get(i).get(j), temp, visited);
                if(! valid){
                    return;
                }
            }
        }
        // 结束完之后，就直接赋值为2，代表它已经永久的访问完了
        visited[i] = 2;
    }

}