package LowestCommonAncestoroaBinarySearchTree235;

public class LowestCommonAncestoroaBinarySearchTree235 {
}


class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }



// 首先 root 节点是所有节点的父亲，所以不存在两个节点，没有公共的节点
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode ancestor = root;
        while(true){
            // 如果都小，还可以往下滑
            if(p.val < ancestor.val && q.val < ancestor.val){
                ancestor = ancestor.left;
            }
            // 如果都大，也可以往下滑
            else if(p.val > ancestor.val && q.val > ancestor.val){
                ancestor = ancestor.right;
            }
            else{
                break;
            }
        }
        return ancestor;

    }
}