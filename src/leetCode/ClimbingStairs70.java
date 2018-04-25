package leetCode;

/**
 * test
 *
 * @author nanj
 * @date 2018/4/25
 *
 *
 *70. Climbing Stairs
 *
 * You are climbing a stair case. It takes n steps to reach to the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 * Note: Given n will be a positive integer.
 *
 * Example 1:
 *
 * Input: 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * Example 2:
 *
 * Input: 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 *
 *
 *
 */

public class ClimbingStairs70 {

    public static void main(String[] args) {
        ClimbingStairs70 climbingStairs70 = new ClimbingStairs70();

        int res = climbingStairs70.climbStairs(2);
        System.out.println(res);
    }

    public int climbStairs(int n) {
        int res = fib(0, 1, n + 1);
        return res;
    }

    private int fib(int a, int b, int n){

        if(n == 0) {
            return a;
        }
        return fib(b, a + b, n - 1);

    }


}
