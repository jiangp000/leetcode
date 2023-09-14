package BinaryTreePaths257;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths257 {
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

//class Solution {
//    public List<String> binaryTreePaths(TreeNode root) {
//
//    }
//}

// 当最开始是 “”的时候，开始的第一个 就是空白啊 ，大兄弟
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
//       进行递归的遍历，每次放到队列里面中，然后
        List<String> res = new ArrayList<>();
        helper(root, "",  res);
        List<String> myres = new ArrayList<>();
        for(int i = 0; i < res.size(); i++){
            String[] q = res.get(i).split(" ");
            String temp = "";
            for(int j = 1; j < q.length; j++){
                if(j == 1)  temp += q[j];
                else        temp += "->"+q[j];
            }
            myres.add(temp);
        }
        return myres;
    }



    public void helper(TreeNode node, String s,  List<String> res) {
        // temp 是我们新加入的,先要判断是不是叶节点
        // 最优都为空，说明就是叶节点
        if (node.left == null && node.right == null) {
            res.add(s + " " + node.val);
            return;
        }
        // 如果是左子节点不为空，那么久
        if (node.left != null) {
            helper(node.left, s + " " + node.val,  res);
        }
        if (node.right != null) {
            helper(node.right, s + " " + node.val,  res);
        }
    }
}