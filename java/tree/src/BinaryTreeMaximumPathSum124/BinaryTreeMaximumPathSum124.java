package BinaryTreeMaximumPathSum124;

public class BinaryTreeMaximumPathSum124 {
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class Solution {
    static int num = Integer.MIN_VALUE;


    public int maxPathSum(TreeNode root) {
        maxGain(root);
        return  num;
    }
    public int maxGain(TreeNode root) {
        if(root == null) return  0;

        // 找到左边有用的部分，
        // 找到右边有用的部分
        // 总的就是左边加右边 + 自己
        // 返回的时候，只能选择一个方向，左边还是右边 ？


        int left  = Math.max(maxGain(root.left), 0);
        int right = Math.max(maxGain(root.right), 0);
        int total = root.val + left + right;
        num = Math.max(num, total);
        return root.val + Math.max(left,right);

    }
}