package HouseRobberIII337;

import java.util.HashMap;
import java.util.Map;

public class HouseRobberIII337 {
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


//   在树上如何进行 DP？、
//   当父节点被选中的时候，此时左右子节点都不能选
//   当O 不被选中的时候，O的左右孩子可以被选中，也可以不被选中，它对O的贡献是
class Solution {
    Map<TreeNode,Integer> f = new HashMap();
    Map<TreeNode,Integer> g = new HashMap();
    public int rob(TreeNode root) {
        dfs(root);
        return  Math.max(f.getOrDefault(root,0),g.getOrDefault(root,0));
    }

    public void dfs(TreeNode node){
        if(node == null ) return;
        dfs(node.left);
        dfs(node.right);

        f.put(node,node.val + g.getOrDefault(node.left,0));
        g.put(node,Math.max(f.getOrDefault(node.left,0),g.getOrDefault(node.left,0)));

    }
}