package huawei;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * test class
 *
 * @author nanj
 * @date 2018/4/10
 */
public class JumpDp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int[] maxStep = new int[n];
        for(int i = 0; i < n; ++i) {
            maxStep[i] = sc.nextInt();
        }


        int[] dp = new int[n];
        int[] left = new int[n];
//
//        List<Integer> route = new LinkedList<>();
//        List<List> dp = new ArrayList<>();
//
//        for(int i = 0; i < n; ++i) {
//            dp.add(route);
//        }

//        dp.set(0)
//        dp.get(0).add(0);

        dp[0] = 0;
        left[0] = 0;
        for(int i = 1; i < n; i ++) {
//            System.out.println(dp[i]);
            if(left[i- 1] >= 1) {
                dp[i] = dp[i -1];
                left[i] = left[i - 1] -1;
            } else {
                dp[i] = dp[i - 1] + 1;
                left[i] = maxStep[i] -1;
            }
        }

//        System.out.print(dp[n]);


        for(int i = 0; i < n; ++i) {
//            System.out.println("max:" + maxStep[i]);
            System.out.println(maxStep[i] + " :" + dp[i] + ":" + left[i]);

        }

        System.out.println(dp[n -1]);


    }


}
