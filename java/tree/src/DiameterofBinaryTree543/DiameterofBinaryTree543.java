package src.DiameterofBinaryTree543;

public class DiameterofBinaryTree543 {
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
    static  int ans = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        // 最大的距离
        // 当前节点是最大距离的一部分，或者是不是最大距离的一部分

        ans = 1;
        depth(root);
        return  ans - 1;
    }

    public int depth(TreeNode root){
        if(root == null) return 0;
        int left = depth(root.left);
        int right = depth(root.right);
        ans = Math.max(ans,left + right + 1);
        return Math.max(left,right) + 1;

    }
}