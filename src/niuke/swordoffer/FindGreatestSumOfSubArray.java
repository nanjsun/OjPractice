package niuke.swordoffer;

import java.util.Scanner;

/**
 * test
 * dynamic plain
 *
 * @author nanj
 * @date 2018/8/28
 */
public class FindGreatestSumOfSubArray {

    public static void main(String[] args) {

//        int[] array = {1,-2,3,10,-4,7,2,-5};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; ++i) {
            array[i] = sc.nextInt();
        }


        int res = new FindGreatestSumOfSubArray().findGreatestSumSubArray(array);
        System.out.println(res);
    }

    public int findGreatestSumSubArray(int[] array) {
//        记录当前所有子数组的和的最大值
        int res = array[0];
//        包含array[i]的连续数组最大值. 关键是包含！！！ 如果第i个数可以加入，则i-1必定包含。所以，维护一个包含i 的最大值，
//        而不是真正意义上的最大值。
        int max=array[0];
        for (int i = 1; i < array.length; i++) {
            max=Math.max(max+array[i], array[i]);
            res=Math.max(max, res);
        }
        return res;
    }
}