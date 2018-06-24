package niuke.swordoffer;

/**
 * test
 *
 * @author nanj
 * @date 2018/6/22
 */
public class VerifySequenceOfBst {

    public static void main(String[] args) {
//        char[] treeChas = {8,5,15,'#',6,14,16};
//        TreeNode root = TreeNode.constructTree(treeChas);
//        int[] res = root.postOrder(root);
//        int[] sample2 = {6, 3, 5, 14, 16, 15, 8};
        int[] sample2 = {1,2,3,4,5};
//        int[] sample2 = {5,4,3,2,1};

        VerifySequenceOfBst verifySequenceOfBst = new VerifySequenceOfBst();

        System.out.println(verifySequenceOfBst.verifySequenceOfBST(sample2));

    }

    public boolean verifySequenceOfBST(int[] sequence) {
        return isSequenceOfBst(sequence, 0, sequence.length - 1);
    }

    private boolean isSequenceOfBst(int[] sequence, int left, int right) {

//        determine if this is a null array
        if(sequence.length == 0) {
            return false;
        }

//        find the split point of array, left is the left sub tree, and right is right subtree;the last element is root
        int splitIndex = left;
        int i = left;
        for( ; i < right; ++i) {
            if(sequence[i] > sequence[right]) {
                splitIndex = i;
                break;
            } else {
                splitIndex ++;
            }
        }

//        all elements of right subtree must bigger than root
        for(int j = splitIndex + 1; j < right; ++j) {
            if(sequence[j] < sequence[right]) {
                return false;
            }
        }

//        recursion both left and right subtree
        boolean leftTree = true;
        if(splitIndex - left > 0) {
            leftTree = isSequenceOfBst(sequence, left, splitIndex - 1);
        }

        boolean rightTree = true;
        if(splitIndex < right){
            rightTree = isSequenceOfBst(sequence, splitIndex, right - 1);
        }
        return (leftTree && rightTree);
    }
}
