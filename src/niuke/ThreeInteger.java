package niuke;

import java.util.Scanner;

/**
 * test
 *
 * @author nanj
 * @date 2018/4/19
 */
public class ThreeInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int oriSum = a + b + c;

        int max = Math.max(a, b);
        max = Math.max(max, c);

        int res = 0;
        int x = max;
        while ((x * 3 - oriSum) % 2 != 0) {
            x++;
        }
        res = (x * 3 - oriSum) / 2;


        System.out.println(res);


    }

}
