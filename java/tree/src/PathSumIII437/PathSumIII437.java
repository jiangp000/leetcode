package PathSumIII437;

public class PathSumIII437 {
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


//   这里说的是所有的路劲，不一定是非要从子节点开始的
// d
class Solution {
    public int pathSum(TreeNode root, int sum) {
        return dfs(root,sum) + pathSum(root.left,sum) + pathSum(root.right,sum);

    }

    public int dfs(TreeNode node,int sum){
        if(node == null) return 0;

        int count = node.val == sum ? 1 : 0;
        count += dfs(node.left,sum - node.val);
        count += dfs(node.right,sum - node.val);
        return count;

    }
}