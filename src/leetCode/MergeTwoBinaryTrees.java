package leetCode;

import java.security.PublicKey;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * test class
 *
 * @author nanj
 * @date 2018/4/2
 */
//

//    617. Merge Two Binary Trees
//Given two binary trees and imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not.
//
//        You need to merge them into a new binary tree. The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of new tree.
//
//        Example 1:
//        Input:
//        Tree 1                     Tree 2
//        1                         2
//        / \                       / \
//        3   2                     1   3
//        /                           \   \
//        5                             4   7
//        Output:
//        Merged tree:
//        3
//        / \
//        4   5
//        / \   \
//        5   4   7

public class MergeTwoBinaryTrees {
    private static int index = 0;
    private char[] charArrary = {1, 2, 3, 4, 5, 6, 7, 8, 9};

//  solution for leetcode
    class Solution {

        public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

            if((t1 == null) && (t2 == null)) {
                return t1;
            }
            // if()
            if((t1 == null) && (t2 != null)){
                t1 = t2;
                // t1.val = t2.val;
                // t1.left = t2.left;
                // t1.right = t2.right;
                return t1;
            }
            if((t1 != null) && (t2 == null)) {
                return t1;
            }

            if((t1 != null) && (t2 != null)) {
                if((t1.left == null) && (t2.left != null)) {
                    t1.left = new TreeNode(0);
                }

                if((t1.right == null) && (t2.right != null)) {
                    t1.right = new TreeNode(0);
                }


                t1.val = t1.val + t2.val;
                mergeTrees(t1.left, t2.left);
                mergeTrees(t1.right, t2.right);
            }

            return t1;

        }
    }




    public static void main(String[] args) {
        MergeTwoBinaryTrees mg = new MergeTwoBinaryTrees();
        TreeNode root = new TreeNode(999);

        TreeNode xx = mg.creatTree(root);
        mg.printTree(xx);
    }

    public void printTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            System.out.println("queue.size() in print :" + queue.size());
            TreeNode cur = queue.poll();

            System.out.println(cur.val);
            if(cur.left != null) {
                queue.add(cur.left);
            }
            if(cur.right != null) {
                queue.add(cur.right);
            }
        }

        return;
    }




    public TreeNode creatTree(TreeNode root) {
        Queue<TreeNode> treeQue = new PriorityQueue<>();
        root = new TreeNode(charArrary[index]);
        treeQue.add(root);
        index ++;
        while (!treeQue.isEmpty()) {
            System.out.println("treeQue.size() in create :" + treeQue.size());

            TreeNode temp = treeQue.poll();

            if(index < charArrary.length){
                temp.left = new TreeNode(charArrary[index]);
                treeQue.add(temp.left);
                index ++;
            } else {
                break;
            }

            if(index < charArrary.length) {
                temp.right = new TreeNode(charArrary[index]);
                treeQue.add(temp.right);
                index ++;
            } else {
                break;
            }
        }
        return root;
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }

}

