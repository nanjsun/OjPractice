package leetCode;

import org.w3c.dom.ranges.Range;

/**
 * test
 *
 * @author nanj
 * @date 2018/4/26
 *
 *
 * 746. Min Cost Climbing Stairs
 *
 *
 *On a staircase, the i-th step has some non-negative cost cost[i] assigned (0 indexed).
 *
 * Once you pay the cost, you can either climb one or two steps. You need to find minimum cost to reach the top of the floor, and you can either start from the step with index 0, or the step with index 1.
 *
 * Example 1:
 * Input: cost = [10, 15, 20]
 * Output: 15
 * Explanation: Cheapest is start on cost[1], pay that cost and go to the top.
 * Example 2:
 * Input: cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
 * Output: 6
 * Explanation: Cheapest is start on cost[0], and only step on 1s, skipping cost[3].
 * Note:
 * cost will have a length in the range [2, 1000].
 * Every cost[i] will be an integer in the range [0, 999].
 *
 */
public class MinCostClimbingStairs746 {

    public static void main(String[] args) {
        MinCostClimbingStairs746 minCostClimbingStairs746 = new MinCostClimbingStairs746();
//        int[] cost = {10, 15, 20};
//        int[] cost = {};
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int res = minCostClimbingStairs746.minCostClimbingStairs(cost);

//        for(int i: minCostClimbingStairs746.dp){
//            System.out.println(i);
//        }
        System.out.println(" ");
        System.out.println("res: " + res);
    }


    private int[] dp;
    public int minCostClimbingStairs(int[] cost) {
        dp = new int[cost.length];
        for(int i = 0; i < dp.length; i++){
            dp[i] = -1;
        }
        if(cost.length <= 1) {
            return 0;
        }

        int index = cost.length - 1;
        return Math.min(search(cost, index), search(cost, index -1));
    }

    private int search(int[] cost, int index){
        int res;
//        if(index == 0) {
//            return 0;
//        }
        if(index <= 1) {
//            dp[0] = 0;
//            dp[1] = cost[0];
            return cost[index];
        }
        if(dp[index] != -1) {
            return dp[index];
        }

        res = Math.min(search(cost, index -1), search(cost, index -2)) + cost[index];
        dp[index] = res;
//        System.out.println(res);
        return res;
    }
}
