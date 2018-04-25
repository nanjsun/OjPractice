package leetCode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

/**
 * test
 *
 * @author nanj
 * @date 2018/4/23
 */
public class ShortestUnsortedContinuousSubarray581 {

    public static void main(String[] args) {
        ShortestUnsortedContinuousSubarray581 shortestUnsortedContinuousSubarray581 = new ShortestUnsortedContinuousSubarray581();
//        int[] nums = {2, 6, 4, 8, 10, 9, 15};
//        int[] nums = {1,2,3,4};
        int[] nums = {2, 1};
//        int[] nums = {1};
        int res = shortestUnsortedContinuousSubarray581.findUnsortedSubarray(nums);
        System.out.println(res);
    }

    public int findUnsortedSubarray(int[] nums) {
        int res = 0;
        int[] sortedNums = nums.clone();
        Arrays.sort(nums);
        int left = -1;
        int right = nums.length;
        for(int i = 0; i < nums.length; ++i) {
            if(nums[i] == sortedNums[i]){
                left = i;
            } else {
                break;
            }
        }
        for(int i = nums.length - 1; i >= 0; --i) {

            if(nums[i] == sortedNums[i]){
                right = i;
            } else {
                break;
            }
            if(right == left) {
                return 0;
            }
        }
        System.out.println("left:" + left);
        System.out.println("right:" + right);
        for(int i: nums) {
            System.out.print("," + i);
        }
        for(int i: sortedNums) {
            System.out.print("," + i);
        }
        res = right - left - 1;
        return res;
    }

    public int findUnsortedSubarray2(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        int begin = -1;
        int end = -1;
        int len = nums.length;

        int max = nums[0];
        int min = nums[len - 1];

        for(int i = 0; i < len; ++i) {
            if(nums[i] >= max) {
                max = nums[i];
            } else {
                end = i;
            }
            if(nums[len - 1 - 1] <= min){
                min = nums[len - 1 - i];
            } else {
                begin = len - 1 -i;
            }
        }

        if(begin == -1) {
            return 0;
        }else {
            return  end - begin + 1;
        }
    }
}
