package SumRoottoLeafNumbers129;

import java.util.ArrayList;
import java.util.List;

public class SumRoottoLeafNumbers129 {
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class Solution {
    public int sumNumbers(TreeNode root) {
//       进行递归的遍历，每次放到队列里面中，然后
        ArrayList<String> q = new ArrayList<>();
        helper(root, "",  q);
        int res = 0;
        for(int i = 0; i < q.size(); i++){
            res += Integer.valueOf(q.get(i));
        }
        return res;
    }


    public void helper(TreeNode node, String s,List<String> res) {
        // temp 是我们新加入的,先要判断是不是叶节点
        // 最优都为空，说明就是叶节点
        if (node.left == null && node.right == null) {
            s += node.val;
            res.add(s);
        }
        // 如果是左子节点不为空，那么久
        if (node.left != null) {
            helper(node.left, s +  node.val, res);
        }
        if (node.right != null) {
            helper(node.right, s +  node.val,  res);
        }
    }
}