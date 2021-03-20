package FlattenBinaryTreetoLinkedListGiven114;

import java.util.ArrayList;
import java.util.List;

public class FlattenBinaryTreetoLinkedListGiven114 {
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
    public void preOrder(TreeNode node, List<TreeNode> num){
        if(node == null) return ;
        num.add(node);
        preOrder(node.left,num);
        preOrder(node.right,num);
    }
    public void flatten(TreeNode root) {
        List<TreeNode> num = new ArrayList<>();
        preOrder(root,num);

        for(int i = 1; i < num.size(); i++){
            TreeNode pre = num.get(i - 1) , preNex = num.get(i ) ;
            pre.left = null;
            pre.right = preNex;
        }

    }
}