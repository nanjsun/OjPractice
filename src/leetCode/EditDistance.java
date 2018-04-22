package leetCode;

/**
 * test
 *
 * @author nanj
 * @date 2018/4/21
 */

/**
 * LeetCode 72 Edit Distance
 * Given two words word1 and word2, find the minimum number of operations required to convert word1 to word2.
 *
 * You have the following 3 operations permitted on a word:
 *
 * Insert a character
 * Delete a character
 * Replace a character
 * Example 1:
 *
 * Input: word1 = "horse", word2 = "ros"
 * Output: 3
 * Explanation:
 * horse -> rorse (replace 'h' with 'r')
 * rorse -> rose (remove 'r')
 * rose -> ros (remove 'e')
 * Example 2:
 *
 * Input: word1 = "intention", word2 = "execution"
 * Output: 5
 * Explanation:
 * intention -> inention (remove 't')
 * inention -> enention (replace 'i' with 'e')
 * enention -> exention (replace 'n' with 'x')
 * exention -> exection (replace 'n' with 'c')
 * exection -> execution (insert 'u')
 *
 *
 */


public class EditDistance {
    private String wordX = "horse";
    private String wordY = "ros1";
//    private int[][] dp = new int[][]

    public static void main(String[] args) {
        EditDistance ed = new EditDistance();
        int maxSubSeqLen = ed.findMaxSubSeq(0, 0);

        System.out.println(maxSubSeqLen);

    }
    private int findMaxSubSeq(int xInx, int yInx){
        System.out.println("xInx:" + xInx + "--yInx:" + yInx);
        int res = 0;
        if(xInx >= wordX.length() || yInx >= wordY.length()) {
            return 0;
        }
        if(xInx == wordX.length() -1 && yInx == wordX.length() - 1) {
            return 0;
        }
        if(wordX.charAt(xInx) == wordY.charAt(yInx)){
            System.out.println("");
            System.out.println("Yes!");
            res = Math.max(findMaxSubSeq(xInx + 1, yInx + 1) + 1, findMaxSubSeq(xInx + 1, yInx));
            res = Math.max(res, findMaxSubSeq(xInx, yInx + 1));
        }else {
            res = Math.max(findMaxSubSeq(xInx + 1, yInx), findMaxSubSeq(xInx, yInx + 1));
        }

        return res;


    }
}
