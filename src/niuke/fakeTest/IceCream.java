package niuke.fakeTest;

import java.util.Scanner;

/**
 * test
 *
 * @author nanj
 * @date 2018/5/23
 */
public class IceCream {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
//        System.out.println("count:" + count);

        int[][] ice = new int[count][4];
        for(int i = 0; i < count; ++i) {
            ice[i][0] = sc.nextInt();
            ice[i][1] = sc.nextInt();
            ice[i][2] = sc.nextInt();
            ice[i][3] = sc.nextInt();
        }
        isHealth(ice);
    }
    private static void isHealth(int[][] ice) {
//        System.out.println("calu");

        for(int[] single : ice){

            calcu(single);
        }
    }

    private static void calcu(int[] single){
        if(single[0] * 6 > single[1] + 2 * single[2] + 3 * single[3]) {
            System.out.println("No");
            return;
        }
        if(single[0] * 6 - (single[1] + 2 * single[2] + 3 * single[3]) == 1){
            if(single[2] % 3 != 0){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");

    }
}
