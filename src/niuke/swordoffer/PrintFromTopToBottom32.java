package niuke.swordoffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * test
 *
 * @author nanj
 * @date 2018/6/14
 */
public class PrintFromTopToBottom32 {
    public static void main(String[] args) {
        char[] numbers = {1,2,3,4,5,6,7};
//        char[] numbers = {};
        TreeNode root = TreeNode.constructTree(numbers);

        PrintFromTopToBottom32 test = new PrintFromTopToBottom32();
        ArrayList<Integer> res = test.PrintFromTopToBottom(root);
        for(int i : res) {
            System.out.print(i + ",");
        }

    }
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null) {
            return res;
        }

        Queue<TreeNode> fatherNode = new LinkedList<>();
        Queue<TreeNode> childNode = new LinkedList<>();

        res.add(root.val);
        fatherNode.add(root);
        while (!fatherNode.isEmpty()) {
            TreeNode current = ((LinkedList<TreeNode>) fatherNode).remove();
            if(current.left != null) {
                res.add(current.left.val);
                ((LinkedList<TreeNode>) childNode).add(current.left);
            }
            if(current.right != null) {
                res.add(current.right.val);
                ((LinkedList<TreeNode>) childNode).add(current.right);
            }

            if(fatherNode.isEmpty()) {
                fatherNode = childNode;
                childNode = new LinkedList<>();
            }
        }
        return res;
    }
}
