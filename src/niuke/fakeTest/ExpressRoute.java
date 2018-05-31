package niuke.fakeTest;

import java.util.Map;
import java.util.Scanner;

/**
 * test
 *
 * @author nanj
 * @date 2018/5/23
 */
public class ExpressRoute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positions = sc.nextInt();
        int ways = sc.nextInt();
        int start = sc.nextInt();
        int target = sc.nextInt();
        int[][] routes = new int[ways][3];
        for(int i = 0; i < ways; ++i) {
            routes[i][0] = sc.nextInt();
            routes[i][1] = sc.nextInt();
            routes[i][2] = sc.nextInt();
        }
    }

    private static int minLength(int[][] ways, int start, int target) {
        int distance = Math.abs(target - start) + 1;
        int[][] costs = new int[distance][distance];
//        for(int )
        System.out.println();
        return 0;
    }
}
