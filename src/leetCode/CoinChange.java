package leetCode;

/**
 * test
 *
 * @author nanj
 * @date 2018/4/20
 */

//322. Coin Change

//You are given coins of different denominations and a total amount of money amount. Write a function to compute the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.
//
//        Example 1:
//        coins = [1, 2, 5], amount = 11
//        return 3 (11 = 5 + 5 + 1)
//
//        Example 2:
//        coins = [2], amount = 3
//        return -1.
//
//        Note:
//        You may assume that you have an infinite number of each kind of coin.

/**
 * 思路：
 * 1.对每种硬币遍历，有两种选择，使用当前硬币或者不使用当前硬币；
 * 2.优化思路，记录已经计算过的硬币
 */
public class CoinChange {
    private static int maxValue = 100000000;
    private static int xLength = 1000;
    private static int yLength = 100000;
    private static int[][] f = new int[xLength][yLength];


    public static void main(String[] args) {
        CoinChange coinChange = new CoinChange();
        int[] coins = {1};
        int amount = 1;
//        int[] coins = {1, 2, 5};
//        int amount = 11;
        int res = coinChange.coinChange(coins, amount);
        System.out.println("res:" + res);

    }


    public int coinChange(int[] coins, int amount) {
        for(int i = 0; i < xLength; ++i) {
            for(int j = 0; j < yLength; ++j) {
                f[i][j] = -1;
            }
        }
        int res = search(0, amount, coins);
        if(res < maxValue){
            return res;
        } else {
            return -1;
        }
    }
    public int search(int idx, int amount, int[] coins) {
        if(amount == 0) {
            return 0;
        }

        if (amount < 0) {
            return maxValue;
        }

        if(idx >= coins.length) {
            return maxValue;
        }

        if(f[idx][amount] >= 0) {
            return f[idx][amount];
        }

        int a = search(idx, amount - coins[idx], coins) + 1;
        int b = search(idx + 1, amount, coins);
        System.out.println("a:" + a);
        System.out.println("b:" + b);
        f[idx][amount] = Math.min(a, b);
        return Math.min(a, b);
    }
}
