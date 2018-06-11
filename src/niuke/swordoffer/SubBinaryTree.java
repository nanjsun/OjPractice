package niuke.swordoffer;

/**
 * test
 *
 * determine if tree A is the  subTree of binary tree B.
 *
 * @author nanj
 * @date 2018/6/9
 */
public class SubBinaryTree {
    public static void main(String[] args) {
        SubBinaryTree subBinaryTree = new SubBinaryTree();

        TreeNode root1 = new TreeNode(0);
        TreeNode root2 = new TreeNode(1);
        subBinaryTree.hasSubtree(root1, root2);


    }


    public boolean hasSubtree(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null){
            return true;
        }
        if(root1 == null || root2 == null) {
            return false;
        }
        if(root1.val == root2.val) {
            return isSameTree(root1, root2);
        }
        return hasSubtree(root1.right, root2.right) || hasSubtree(root1.left, root2.left);
    }


    private boolean isSameTree(TreeNode root1, TreeNode root2) {
        if(root1 == null || root2 == null) {
            return false;
        }
        if(root1.val != root2.val) {
            return false;
        }

        return isSameTree(root1.left, root2.left) && isSameTree(root1.right, root2.right);
    }
}
