package NaryTreeLevelOrderTraversal429;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NaryTreeLevelOrderTraversal429 {
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


class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Queue<Node> queue = new LinkedList();
        queue.add(root);
        while (!queue.isEmpty()) {
            int N = queue.size();
            List<Integer> eachList = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                Node temp = queue.remove();
                eachList.add(temp.val);
                List<Node> tempList = temp.children;
                if (tempList == null) continue;
                for (int j = 0; j < tempList.size(); j++) {
                    queue.add(tempList.get(j));
                }
            }
            res.add(eachList);
        }
        return res;
    }
}