package WiggleSortII324;

import java.util.HashMap;

public class main {
}


class QSolution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        HashMap<Integer,Integer> res = new HashMap();
        res.put(dislikes[0][0],0);
        res.put(dislikes[0][1],1);
        // 如果说开始两个都可以，那么怎么办呢？
        // 2，3
        for(int i = 0; i < dislikes.length; i++){
            // 先看
        }

    }
}


// 给定一组 N 人，我们把每一个人分进任意大小的两组
// 每个人都可能不喜欢其他人，那么他们不应该属于同一组
// 形式上，dislike[i[][j] 代表不允许讲 i 和 j 分在一组
// 当用这种方法可以讲所有人分进两组的时候,返回为 true,否则是 false
//  并查集吗? 如果两个人不喜欢,那么就得分为两组
// 在一群反对的人群中,进行合并
//  1 -> 2 3
//  2 -> 1 4
//  3 - 1
//  我们把1 分为 一组 那么 3 在另外的一组
//  2，3 可以在一起，
// dislike中的[0][0] 一个是红色的，一个就是蓝色的，后面如果有人违反了，那就是 false
//  最后返回true
//  1 红：4
//  2 蓝 3