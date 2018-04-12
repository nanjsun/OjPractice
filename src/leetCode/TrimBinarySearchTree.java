package leetCode;

/**
 * test class
 *
 * @author nanj
 * @date 2018/4/4
 */
public class TrimBinarySearchTree {



    public TreeNode trimBST(TreeNode root, int L, int R) {
//        TreeNode res = new TreeNode(0);
        if(root.val < L) {
            if(root.right != null) {
                root = root.right;
                trimBST(root, L, R);
            }

        }
        if(root.val > R) {
            if(root.left != null) {
                root = root.left;
                trimBST(root, L, R);
            }

        }
        if((root.val) <= R && (root.val >= L)){
            trimBST(root.left, L, R);
            trimBST(root.right, L, R);
        }

        return root;
    }



}


class TreeNode1 {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode1(int x) {
        val = x;
    }
}



