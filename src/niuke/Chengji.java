package niuke;

import java.util.Scanner;

/**
 * test class
 *
 * @author nanj
 * @date 2018/4/9
 */
public class Chengji {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] input = new long[n];
        int i = 0;
        for(int k = 0; k < n; ++k)  {
            input[i] = sc.nextLong();
            i++;
        }
        for(int j = 0; j < n; ++j) {
            if((input[j] % 2) != 0) {
                System.out.println("No");
            } else {
                long res = findMin(input[j]);
                System.out.println(res + " " + input[j] / res);

            }
//            System.out.println(input[j]);


        }


    }

    private static long findMin(long n) {

        while (n % 2 == 0) {
            n = n / 2;
        }
        return n;
    }
}
