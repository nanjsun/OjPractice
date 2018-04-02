package leetCode;

import java.lang.reflect.Array;
import java.util.*;

/**
 * test class
 *
 * @author nanj
 * @date 2018/4/2
 */

//Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
//
//        Example 1:
//        Input: [1,4,3,2]
//
//        Output: 4
//        Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).
//        Note:
//        n is a positive integer, which is in the range of [1, 10000].
//        All the integers in the array will be in the range of [-10000, 10000].

public class ArrayPartitionI {
    public static void main(String[] args) {

        ArrayPartitionI arrayPartitionI = new ArrayPartitionI();

        int[] arr = {1,4,3,2};
        int res = arrayPartitionI.arrayPairSum(arr);
        System.out.println(res);
    }

    public int arrayPairSum(int[] nums) {
        int res = 0;

//        List<Integer> numsList = new LinkedList<>();

//        for(int x : nums) {
//            numsList.add(x);
//        }
        Arrays.sort(nums);


        for(int i = 0; i < nums.length; i = i + 2) {

            res += nums[i];
        }
        return res;
    }

}
