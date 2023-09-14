package PathSumII113;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.util.ArrayList;
import java.util.List;

public class PathSumII113 {
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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
//       进行递归的遍历，每次放到队列里面中，然后
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> q = new ArrayList<>();
        helper(root, "", 0, targetSum, res);
        return res;
    }

    public void add(String s, List<List<Integer>> res) {
        String[] q = s.split(" ");
        List<Integer> temp = new ArrayList<>();
        for (int i = 1; i < q.length; i++) {
            temp.add(Integer.valueOf(q[i]));
        }
        res.add(temp);
        // 这个方法是将我们的字符串 s 转为 数字节点
    }

    public void helper(TreeNode node, String s, int sum, int target, List<List<Integer>> res) {
        // temp 是我们新加入的,先要判断是不是叶节点
        if (node == null) return;
        // 最优都为空，说明就是叶节点
        if (node.left == null && node.right == null) {
            sum += node.val;

            if (sum == target) {
                add(s + " " + node.val, res);
            }
            return;
        }
        // 如果是左子节点不为空，那么久
        if (node.left != null) {
            helper(node.left, s + " " + node.val, sum + node.val,target, res);
        }
        if (node.right != null) {
            helper(node.right, s + " " + node.val, sum + node.val, target, res);
        }
    }
}