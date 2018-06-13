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

        char[] array1 = {8,8,7,9,2,'#','#','#','#',4,7};
//        char[] array1 = {8,8,7,9,2,};
        char[] array2 = {8,9,2};
        TreeNode root1 = TreeNode.constructTree(array1);
        TreeNode root2 = TreeNode.constructTree(array2);

        System.out.println(subBinaryTree.HasSubtree(root1, root2));
    }


    public boolean HasSubtree(TreeNode fatherRoot, TreeNode childRoot) {
        boolean result = false;
        if (fatherRoot != null && childRoot != null) {
            if (fatherRoot.val == childRoot.val) {
                result = isSameTree(fatherRoot, childRoot);
            }
            if (!result) {
                result = HasSubtree(fatherRoot.left, childRoot);
            }
            if (!result) {
                result = HasSubtree(fatherRoot.right, childRoot);
            }
        }
        return result;
    }

    private boolean isSameTree(TreeNode root1, TreeNode root2) {
        if(root2 == null) {
            return true;
        }
        if(root1 == null) {
            System.out.println("root1 is null");
            return false;
        }


        if(root1.val != root2.val) {
            System.out.println("different val");
            return false;
        }
        return isSameTree(root1.left, root2.left) && isSameTree(root1.right, root2.right);
    }
}
