# 452  Minimum Number of Arrows to Burst Balloons

[TOC]

## 1：题目描述

![image-20210127110530666](C:\Users\jiang000\AppData\Roaming\Typora\typora-user-images\image-20210127110530666.png)

## 2：解决思路

- 先排序，从小到大
- 开始 < END  则  整个__开始 = 开始
- 结尾 < END  则 整个 __结尾 = 结尾
- 否则
  - NUM++
  - 整个__开始 = 新的开始
  - 整个__结尾 = 新的结尾



## 3：代码

```java
class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points==null || points.length ==0) return 0;
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] <o2[0]) return -1;
                return 1;
            }
        });


        int result=1,begin=points[0][0],end=points[0][1];
        for(int i=1;i<points.length;i++){
            if(points[i][0] <= end){
                begin=points[i][0];
                if(points[i][1] < end){
                    end=points[i][1];
                }
            }
            else{
                result++;
                begin=points[i][0];
                end=points[i][1];
            }
        }
        return result;

    }
}
```



## 4：正数负数相减超出范围(问题)

```java
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
```

```java
            public int compare(int[] o1, int[] o2) {
                if(o1[0] <o2[0]) return -1;
                return 1;
            }
```

- 不用减法 直接比较大小 

## 5：50%

![image-20210127110239024](C:\Users\jiang000\AppData\Roaming\Typora\typora-user-images\image-20210127110239024.png)

