package src.BiNodeLCCI1712;

public class BiNodeLCCI1712 {
}
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

class Solution {
    TreeNode head = new TreeNode(-1);
    TreeNode prev = null;
    public TreeNode convertBiNode(TreeNode root) {
        if(root == null) return  null;
        return  head.right;

    }
    public void helper(TreeNode root){
        if(root == null) return;
        helper(root.left);
        if(prev == null){
            prev = root;
            head.right = root;
        }
        else{
            prev.right = root;
            prev = root;
        }
        root.left = null;
        helper(root.right);
    }
}