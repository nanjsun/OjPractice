package niuke.swordoffer;

import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * test
 *
 * @author nanj
 * @date 2018/6/11
 */

public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;
    ArrayList<Integer> preOrderResult = new ArrayList<>();
    ArrayList<Integer> inOrderResult = new ArrayList<>();
    ArrayList<Integer> postOrderResult = new ArrayList<>();
    ArrayList<Integer> levelOrderResult = new ArrayList<>();

    public TreeNode(int x) {
        val = x;
    }

    public static void main(String[] args) {
        char[] chars = {1,2,3,4,5,'#',7,8};
        TreeNode root = constructTree(chars);
        System.out.println("preOrder:");
        int[] res = root.levelOrder(root);
        System.out.println("res length: " + res.length);
        for (int i :
                res) {
            System.out.print(i + ",");
        }
    }

    public int[] preOrder(TreeNode root) {
        if(root == null) {
            return null;
        }
        System.out.println(root.val);
        preOrderResult.add(root.val);
        preOrder(root.left);
        preOrder(root.right);
        return preOrderResult.stream().mapToInt(Integer::intValue).toArray();
    }
    public int[] inOrder(TreeNode root) {
        if(root == null) {
            return null;
        }
        inOrder(root.left);
        System.out.println(root.val);
        inOrderResult.add(root.val);
        inOrder(root.right);
        return inOrderResult.stream().mapToInt(Integer::intValue).toArray();
    }
    public int[] postOrder(TreeNode root) {
        if(root == null) {
            return null;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.val);
        postOrderResult.add(root.val);
        return postOrderResult.stream().mapToInt(Integer::intValue).toArray();
    }
    public int[] levelOrder(TreeNode root) {
        Queue<TreeNode> queueFather = new LinkedList<>();
        Queue<TreeNode> queueChild = new LinkedList<>();
//        this.levelOrderResult = ;
        ((LinkedList<TreeNode>) queueFather).add(root);
        while (!queueFather.isEmpty()) {
            TreeNode current = ((LinkedList<TreeNode>) queueFather).removeFirst();
            levelOrderResult.add(current.val);
            if(current.left != null) {
                queueChild.add(current.left);
            }
            if(current.right != null) {
                queueChild.add(current.right);
            }
            if(queueFather.isEmpty()){
                queueFather = queueChild;
                queueChild = new LinkedList<>();
            }
        }
        return levelOrderResult.stream().mapToInt(Integer::intValue).toArray();
    }

    public static TreeNode constructTree(char[] chars){
        TreeNode root = new TreeNode(chars[0]);
//        Queue<TreeNode> queueFather = new LinkedList<>();
        Queue<TreeNode> queueFather = new LinkedList<>();
        Queue<TreeNode> queueChild = new LinkedList<>();
        queueFather.add(root);
        int current = 1;
        while (current < chars.length){
            while (!queueFather.isEmpty()) {
                TreeNode currentNode = ((LinkedList<TreeNode>) queueFather).removeFirst();
                if(current < chars.length){
                    TreeNode left;
                    if(chars[current] == '#'){
                        left = null;
                    } else {
                        left = new TreeNode(chars[current]);
                    }
                    queueChild.add(left);
                    currentNode.left = left;
                    current += 1;
//                    System.out.println("left.val: " + left.val);
//                    System.out.println("size:" + queueChild.size());
                } else {
                    break;
                }


//                System.out.println(current);
                if(current < chars.length){
                    TreeNode right;
                    if(chars[current] == '#'){
                        right = null;
                    } else {
                        right = new TreeNode(chars[current]);
                    }
                    queueChild.add(right);
                    currentNode.right = right;
                    current += 1;
                } else {
                    break;
                }
            }
            queueFather = (LinkedList<TreeNode>)queueChild;
            queueChild = new LinkedList<>();
        }
        return root;
    }

}