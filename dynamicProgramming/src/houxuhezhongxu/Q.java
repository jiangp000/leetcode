package houxuhezhongxu;

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

public class  Q {
    public static void main(String[] args) {
        Solution test = new Solution();
        int[] inOrder = {9,3,15,20,7};
        int[] postOrder = {9,15,7,20,3};
        test.buildTree(inOrder,postOrder);
    }

}




class Solution {
    public TreeNode buildTree(int[] inOrder,int[] posterOrder) {
        return helper(0, posterOrder.length - 1, 0, posterOrder.length - 1 , inOrder,posterOrder );
    }


    public TreeNode helper( int instart, int inend,
                            int poststart, int postend, int[] inOrder, int[] postOrder){
        if(instart > inend || postend < 0 || poststart > inOrder.length - 1) return null;
        int value = postOrder[postend];
        TreeNode root = new TreeNode(value);
        int index = 0;
        for(int i = 0; i < inOrder.length; i++){
            if(inOrder[i] ==value) {
                index = i;
                break;

            }
        }
        int left = index - instart;
        System.out.println(" +++++");
//    中序遍历 inorder = [9,3,15,20,7]
//    后序遍历 postorder = [9,15,7,20,3]
//         3
//     9     20
//         15   7
        root.left  = helper(instart,index -1 ,
                poststart,poststart + left - 1,
                inOrder,postOrder);
        root.right = helper(index + 1, inend,
                poststart + left, postend - 1,
                inOrder,postOrder );

        return root;

    }
}

