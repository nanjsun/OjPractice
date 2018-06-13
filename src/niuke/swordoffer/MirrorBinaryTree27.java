package niuke.swordoffer;

/**
 * test
 *
 * @author nanj
 * @date 2018/6/13
 */
public class MirrorBinaryTree27 {


    public void Mirror(TreeNode root) {
        if(root == null) {
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        Mirror(root.left);
        Mirror(root.right);

    }
}
