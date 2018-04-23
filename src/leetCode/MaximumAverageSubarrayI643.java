package leetCode;

import java.util.Arrays;
import java.util.Collections;

/**
 * test
 *
 * @author nanj
 * @date 2018/4/23
 *
 *643. Maximum Average Subarray I
 *Given an array consisting of n integers, find the contiguous subarray of given length k that has the maximum average value. And you need to output the maximum average value.
 *
 * Example 1:
 * Input: [1,12,-5,-6,50,3], k = 4
 * Output: 12.75
 * Explanation: Maximum average is (12-5-6+50)/4 = 51/4 = 12.75
 * Note:
 * 1 <= k <= n <= 30,000.
 * Elements of the given array will be in the range [-10,000, 10,000].
 *
 */
public class MaximumAverageSubarrayI643 {

    public static void main(String[] args) {
        MaximumAverageSubarrayI643 maximumAverageSubarrayI643 = new MaximumAverageSubarrayI643();

        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;

        double res = maximumAverageSubarrayI643.findMaxAverage(nums, k);
        System.out.println(res);
    }


    public double findMaxAverage(int[] nums, int k) {
        double res = 0.00;
        Integer[] max = new Integer[nums.length - k + 1];
        max[0] = 0;
        for(int i = 0; i < k; ++i) {
            max[0] += nums[i];
//            max[0] += 1;
        }
        for(int i = k; i < nums.length; ++i) {
//            System.out.println(i);
            max[i - k + 1] = max[i - k] + nums[i] - nums[i - k];
        }

        res = (double)Collections.max(Arrays.asList(max)) / k;
        return res;
    }

    /**
     * solution from leetcode discuss
     * @param nums
     * @param k
     * @return
     */

    public double findMaxAverageFast(int[] nums, int k) {
        int tmp = 0, res = 0;
        for(int i = 0; i < k; i++) {
            res += nums[i];
        }
        tmp = res;

        for(int i = k; i < nums.length; i++) {
            tmp = tmp+nums[i]-nums[i-k];

            if(tmp > res) res = tmp;
        }
        return ((double)res)/k;
    }
}
