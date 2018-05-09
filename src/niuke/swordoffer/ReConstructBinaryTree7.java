package niuke.swordoffer;

/**
 * test
 *
 * @author nanj
 * @date 2018/5/4
 */
public class ReConstructBinaryTree7 {

    public static void main(String[] args) {
        ReConstructBinaryTree7 reConstructBinaryTree7 = new ReConstructBinaryTree7();
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in =  {4,7,2,1,5,3,8,6};
//        int[] pre = {3,5,6,8};
//        int[] in  = {5,3,8,6};
        TreeNode result = reConstructBinaryTree7.reConstructBinaryTree(pre, in);
        reConstructBinaryTree7.subsequentTraversal(result);
    }

    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode root = search(pre, in, 0, pre.length - 1, 0, in.length - 1);
        return root;
    }
    private TreeNode search(int[] pre, int[] in, int preBegin, int preEnd, int inBegin, int inEnd){
        if(inBegin > inEnd){
            return null;
        }
        TreeNode currentRoot = new TreeNode(pre[preBegin]);
        System.out.println("currentVal: " + currentRoot.val);

//        for(int i = inBegin; i <= inEnd; i ++) {
//        for(int i = 0; i <= inEnd - inBegin; i ++) {
//            if(in[i] == currentRoot.val) {
//                currentRoot.left =  search(pre, in, preBegin + 1, preBegin + i, inBegin, inBegin  + i -1);
//                currentRoot.right = search(pre, in, preBegin + i + 1, preEnd, inBegin + i + 1, inEnd);
////                break;
//            }
////            break;
//        }
        int index = inBegin;
        while (index <= inEnd && in[index] != pre[preBegin]){
            index++;
        }

//      currentRoot.left =  search(pre, in, preBegin + 1, preBegin + i, inBegin, inBegin  + i -1);
//      currentRoot.right = search(pre, in, preBegin + i + 1, preEnd, inBegin + i + 1, inEnd);
        currentRoot.left = search(pre,in,preBegin + 1, preBegin + index - inBegin, inBegin, index - 1);
        currentRoot.right= search(pre,in,preBegin + index -inBegin + 1, preEnd, index + 1, inEnd);
        return currentRoot;
    }

    private void subsequentTraversal(TreeNode root) {
        if(root ==  null) {
            return;
        }
        subsequentTraversal(root.left);
        subsequentTraversal(root.right);
        System.out.println(root.val);
    }
}



//Definition for binary tree
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}