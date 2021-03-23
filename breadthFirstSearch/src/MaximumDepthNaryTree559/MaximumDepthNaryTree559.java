package MaximumDepthNaryTree559;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumDepthNaryTree559 {
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};


// 层次遍历，我现在做题就很虚，感觉没有一个题目可以做出来的那种
// 什么时候才能手撕代码啊~~~
class Solution {
    public int maxDepth(Node root) {
        if(root == null) return 0;
        int res = 1;
        List<Node> temp = root.children;
        if(temp == null || temp.size() == 0) return  1;
        List<Integer> lst = new ArrayList<>();
        for(int i = 0; i < temp.size(); i++){
            // 选择每一个的最大的，是吧~ ，如何选择最大的一个啊？？？
            int Q = maxDepth(temp.get(i));
            lst.add(Q);
        }
        res += Collections.max(lst);
        return res;
    }
}