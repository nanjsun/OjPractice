package leetCode;

/**
 * test class
 *
 * @author nanj
 * @date 2018/3/31
 */
public class MaxAreaOfIsland {

    public int maxAreaOfIsland(int[][] grid) {
        int[][] dp = new int[grid.length + 1][grid[0].length + 1];

        int max = 0;

        for(int i = 0; i < grid.length; ++i) {
            for(int j = 0; j < grid[0].length; ++j) {
                if(grid[i][j] == 1) {
                    dp[i + 1][j + 1] = Math.max(dp[i + 1][j], dp[i][j]) + 1;
                    if(dp[i + 1][j + 1] > max){
                        max = dp[i + 1][j + 1];
                    }
                }

            }
        }

        return max;

    }

}
