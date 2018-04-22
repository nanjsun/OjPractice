package leetCode;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * test
 *
 * @author nanj
 * @date 2018/4/22
 *
 *594. Longest Harmonious Subsequence
 *
 * We define a harmonious array is an array where the difference between its maximum value and its minimum value is exactly 1.
 *
 * Now, given an integer array, you need to find the length of its longest harmonious subsequence among all its possible subsequences.
 *
 * Example 1:
 * Input: [1,3,2,2,5,2,3,7]
 * Output: 5
 * Explanation: The longest harmonious subsequence is [3,2,2,2,3].
 * Note: The length of the input array will not exceed 20,000.
 */
public class LongestHarmoniousSubsequence {
    public static void main(String[] args) {
//        int[] nums = {2,74,83,62,97,51,43,50,46,41,49,52,64,43,58,79,71,35,59,30,19,91,88,13,86,1,5,39,27,45,58,8,30,63,49,12,80,87,42,36,91,88,70,20,36,40,21,66,75,71,33,43,95,62,91,20,95,7,33,84,38,61,4,10,34,31,39,57,23,9,29,18,99,88,64,96,83,17,90,34,27,89,59};
//        int[] nums = {1,2,2,1};
//        int[] nums = {1,1,1,1};
        int[] nums = {5,2,2,6,7,3,5,4,4,6,0,8,0,8,1,10,0,2,0,10,1,9,7,-10,3,3,2,9,9,1,5,9,1,8,1,8,0,5,8,7,6,10,5,-8,10,5,6,10,1,2,4,5,5,0,9,8,5,2,6,1,3,3,10,5,-7,0,7,0,4,2,5,10,7,7,8,0,1,0,4,0,3,1,6,10,10,7,8};

        LongestHarmoniousSubsequence lhs = new LongestHarmoniousSubsequence();
        int res = lhs.findLHS(nums);

        System.out.println(res);

    }


    public int findLHS(int[] nums) {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for(int i = 0; i < nums.length; ++i) {
            if(map.containsKey(nums[i])){
                map.replace(nums[i], map.get(nums[i]) + 1);
            }else {
                map.put(nums[i], 1);
            }
        }

        List<Integer> deleteList = new LinkedList<>();
        for(Map.Entry entry : map.entrySet()){

            if(!map.containsKey((int)entry.getKey() + 1) && !map.containsKey((int)entry.getKey() - 1)){
//                map.remove(entry.getKey());
                deleteList.add((int)entry.getKey());
            }
        }
//        System.out.println("firstKey: " + map.firstKey());
        for(int key : deleteList){
            map.remove(key);
        }
        int firstKey = Integer.MIN_VALUE;
        if(map.isEmpty()) {
            return 0;
        } else {
            firstKey = map.firstKey();

        }

        int lastCount = 0;
        int maxSum = 0;
        int maxKey = 0;

        int lastKey = firstKey - 1;


        for(Map.Entry entry : map.entrySet()) {
//            System.out.println(entry.getKey() + ":" + entry.getValue());
            if((int)entry.getKey() > lastKey + 1) {
                lastKey = (int)entry.getKey();
                lastCount = (int)entry.getValue();

                System.out.println("-->");
                continue;

            }
            lastKey = (int)entry.getKey();

            int sum = lastCount + (int)entry.getValue();
//            System.out.println("sum: " + sum);

            maxSum = Math.max(sum, maxSum);
            maxKey = (int)entry.getKey();
            lastCount = (int)entry.getValue();

            System.out.println("entry.getValue(): " + entry.getValue());
            System.out.println("lastCount: " + lastCount);
            System.out.println("maxSum: " + maxSum);
            System.out.println("maxKey: " + maxKey);
            System.out.println("-----: " );

        }
        return maxSum;
    }


}
