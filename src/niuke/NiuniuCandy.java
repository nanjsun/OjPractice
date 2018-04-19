package niuke;

import java.util.Scanner;

/**
 * test
 *
 * @author nanj
 * @date 2018/4/19
 */
public class NiuniuCandy {
    private static int sum = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int candyDiff = sc.nextInt();
        int box = sc.nextInt();
        int[][] candyRange = new int[candyDiff][2];
        for(int i = 0; i < candyDiff; ++i) {
            candyRange[i][0] = sc.nextInt();
            candyRange[i][1] = sc.nextInt();
        }
        int res = 0;

//        for(int i = 0; i < candyDiff; ++i) {
//            for(int j = candyRange[i][0]; j <= candyRange[i][0]; ++i) {
//
//            }
//        }

//        int dp[][]
        res = calc(box, candyRange);


        System.out.println(candyRange.length);
        System.out.println(sum);


    }

    private static int calc(int m, int[][] candyRange) {
        if(m == 1) {
            return candyRange.length;
        }
        return calc(m - 1, candyRange) + sum;

    }
}
