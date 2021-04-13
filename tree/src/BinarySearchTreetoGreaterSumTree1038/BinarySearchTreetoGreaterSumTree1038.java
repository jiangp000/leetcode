package src.BinarySearchTreetoGreaterSumTree1038;

public class BinarySearchTreetoGreaterSumTree1038 {
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
//   二叉搜索树的加和，那就是加右边的
class Solution {
    int sum = 0;
    public TreeNode bstToGst(TreeNode root) {
        if(root != null){
            // 从右边不停的加和，得到最后的结果
            bstToGst(root.right);
            sum += root.val;
            root.val = sum;
            bstToGst(root.left);
        }
        return  root;

    }
}