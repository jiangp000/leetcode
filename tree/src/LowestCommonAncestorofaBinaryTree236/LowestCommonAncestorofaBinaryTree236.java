package LowestCommonAncestorofaBinaryTree236;

public class LowestCommonAncestorofaBinaryTree236 {
}



 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

// 现在是任意的二叉树，怎么找他的公共前缀
class Solution {
    private  TreeNode ans;

    public Solution(){
        ans = null;
    }

    private boolean dfs(TreeNode root,TreeNode p,TreeNode q){
        if(root == null) return false;
        boolean lson = dfs(root.left,p,q);
        boolean rson = dfs(root.right,p,q);

        //左子树和右子树都包含 P 和 Q，如果 左边包含 P，右边包含 Q
        if( (lson && rson) || ( (root.val == p.val || root.val == q.val ) && (lson || rson))){
            ans = root;
        }
        return  lson || rson ||(root.val == p.val || root.val == q.val);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        this.dfs(root,p,q);
        return this.ans;


    }
}