package CourseScheduleIII630;

import java.util.Arrays;
import java.util.PriorityQueue;

public class CourseScheduleIII630 {
}


class Solution {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses,(a,b) -> a[1] - b[1]);
        // 我之前的排序算法也可以通过这个来做
        // 二维数组，按照第二个维度来进行排序
        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b) -> b - a);
        int time = 0;
        for(int[] c : courses){
            // 如果说时间 <= ，那就说明可以
            if(time + c[0] <= c[1]){
                queue.offer(c[0]);
                time += c[0];
            }
            // 否则就是不行，就把那个取下来
            else if(!queue.isEmpty() && queue.peek() > c[0]){
                time += c[0] - queue.poll();
                queue.offer(c[0]);
            }
        }
        return queue.size();


    }
}