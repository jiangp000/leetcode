package ConstructStringfromBinaryTree606;

public class ConstructStringfromBinaryTree606 {
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
//
//Input: Binary tree: [1,2,3,4]
//        1
//        /   \
//        2     3
//        /
//        4
//1(2()(4)())(()3)
//Output: "1" (2(4)) (3)"

// 如果是叶子节点，即左右子节点均为空，那么()() 可以省略
// 如果右子节点为空，那么第二个括号可以省略
// 但是左子节点为空，右子节点不为空，此时的左子节点就不能省略。

class Solution {
    public String tree2str(TreeNode t) {
        if(t == null) return "";
        String  nowStr  = t.val+"";
        String  leftStr = tree2str(t.left);
        String  rightStr = tree2str(t.right);

        if(t.left == null && t.right == null) return nowStr;
        if(t.right == null) return nowStr+"("+leftStr+")";
        if(t.left == null) return nowStr+"()" +"("+rightStr+")";
        return nowStr+"("+leftStr+")"+"("+rightStr+")";


    }
}
