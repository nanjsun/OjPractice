/**
 * test class
 *
 * @author nanj
 * @date 2018/3/28
 */
public class HouseRobber {
    public static void main(String[] args) {
        HouseRobber houseRobber = new HouseRobber();
        int[] nums = {4,1,1,4};
        int res = houseRobber.rob(nums);
        System.out.println(res);
    }
    public int rob(int[] nums) {
        int[][] dp = new int[nums.length +1][2];

        if(nums.length == 0) {
            return 0;
        }
        if(nums.length == 1) {
            return nums[0];
        }
        dp[0][0] = 0;
        dp[1][0] = nums[0];
        dp[1][1] = 1;

        for(int i = 2; i < nums.length + 1; ++i) {
            if(dp[i - 1][1] == 0) {
                dp[i][0] = dp[i - 1][0] + nums[i - 1];
                dp[i][1] = 1;
            } else {
                if(nums[i - 1] > nums[i - 2] || ((nums[i - 1] + dp[i - 2][0]) > dp[i - 1][0])) {

//                    System.out.println("current1：" + current1);
//                    System.out.println("current2：" + current2);
                    dp[i][0] = Math.max(dp[i - 1][0] - nums[i - 2] + nums[i - 1],
                            nums[i - 1] + dp[i - 2][0]);
                    dp[i][1] = 1;
                } else {
                        dp[i][0] = dp[i - 1][0];
                        dp[i][1] = 0;
                }
            }
        }
//        for(int i = 0; i < dp.length; ++i) {
//            System.out.println(dp[i][0]);
//        }

        return dp[nums.length][0];
    }
}
