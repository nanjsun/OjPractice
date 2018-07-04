package niuke.swordoffer;

import java.util.ArrayList;

/**
 * test
 *
 * @author nanj
 * @date 2018/6/26
 */
public class FindPathOfNumber {
    public static void main(String[] args) {
        FindPathOfNumber find = new FindPathOfNumber();

        char[] chars = {10,5,12,4,7};
        int target = 22;
        TreeNode root = TreeNode.constructTree(chars);
        find.FindPath(root, target);

    }


    private ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        findPath(root, target);

        return res;

    }

    private void findPath(TreeNode root, int target) {
        if(root == null) {
            return;
        }
        int currentSum = 0;
        ArrayList<Integer> path = new ArrayList<>();
        findCorrectPath(path, root, target, currentSum);
        }

    private void findCorrectPath(ArrayList<Integer> path, TreeNode pRoot, int expectedSum, int currentSum) {
        currentSum += pRoot.val;
        path.add(pRoot.val);
//        System.out.println(expectedSum);
//        System.out.println(currentSum);

        boolean isLeaf = pRoot.left == null && pRoot.right == null;

        if(currentSum == expectedSum && isLeaf) {
            ArrayList<Integer> currentPath = new ArrayList<>();
            System.out.print("path:");

            for (int i :
                    path) {
                currentPath.add(i);
                System.out.print(i + ",");
            }
            System.out.println("");

            this.res.add(currentPath);
        }

        if(pRoot.left != null) {
            findCorrectPath(path, pRoot.left, expectedSum, currentSum);
        }

        if(pRoot.right != null) {
            findCorrectPath(path, pRoot.right, expectedSum, currentSum);
        }

        path.remove(path.size() - 1);
    }
}
