package meituan;

import java.util.Scanner;

/**
 * test
 *
 * @author nanj
 * @date 2018/4/20
 */
public class CountBit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Long[] input = new Long[n];
        for(int i = 0; i < n; ++i) {
            input[i] = sc.nextLong();
        }
        for(int i = 0; i < n; ++i) {
//            long resOld = maxLength(input[i]);

            long resFast = maxLenFast(input[i]);
//            System.out.print(input[i] + ":");
//            System.out.println(res);
//            System.out.println("resOld ：" + resOld);
//            System.out.println("resFast ：" + resFast);
            System.out.println(resFast);
        }
    }
    private static long maxLength(Long n) {

        long res = 0;
        for(long i = 1; i <= n; i++) {
            res +=  String.valueOf(i).length();
        }
        return res;

    }



    private static long maxLenFast(Long n) {
        int len = String.valueOf(n).length();
        long res = 0;
        long begin = 0;

        switch (len){
            case  1:
                res = 0;
                begin = 0;
                break;

            case  2:
                res = 11;
                begin = 10;
                break;

            case 3:
                res = 192;
                begin = 100;
                break;

            case 4:
                res = 2893;
                begin = 1000;
                break;

            case 5:
                res = 38894;
                begin = 10000;
                break;
            case  6:
                res = 488895;
                begin = 100000;
                break;

            case 7:
                res = 5888896;
                begin = 1000000;
                break;

            case 8:
                res = 68888897;
                begin = 10000000;
                break;

            case 9:
                res = 788888898;
                begin = 100000000;
                break;
            case 10:
                res = 8888888899L;
//                Long.MAX_VALUE;
//                    8888888899
                begin = 1000000000;
                break;

            default:
                return Long.MAX_VALUE;
//                break;
        }

        res = res + len * (n - begin);
//        System.out.println(res);
//        System.out.println("len:" + len);

        return res;
    }
}
