package MinimumDepthofBinaryTree111;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumDepthofBinaryTree111 {
    public static void main(String[] args) {

    }
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

  // 怎么求每一叶子节点的深度
  class Solution {
      public void helper(TreeNode node, int height, List<Integer> res){
          if(node.left == null && node.right == null){
              res.add(height);
              return;
          }
          if(node.left == null){
              helper(node.right, height + 1,res);
              return ;
          }
          if(node.right == null){
              helper(node.left,height + 1,res);
              return;
          }
          // 否则我们要进行加戏
          helper(node.left,height + 1,res);
          helper(node.right, height + 1,res);
      }
      public int minDepth(TreeNode root) {
          List<Integer> res = new ArrayList<>();
          if(root == null) return 0;
          helper(root,1,res);
          if(res.size() == 0) return 0;
          return Collections.min(res);

      }
  }