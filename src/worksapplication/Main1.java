package worksapplication;

import java.util.Scanner;

/**
 * test
 *
 * @author nanj
 * @date 2018/9/15
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
//        System.out.println(n);
//        System.out.println(k);
        char[][] otherIds = new char[n][k];
        int[] charCount = new int[k];

        for(int i = 0; i < n; i++) {
//            int input = in.nextLine()
            String s = in.nextLine();
            if(s.length() > 0) {
//                System.out.println("s" + s);
                otherIds[i] = s.toCharArray();

                for(int j = 0; j < k; ++j) {
                    if(otherIds[i][j] == '1') {
                        charCount[j] ++;
                    }
                }
            } else {
                i --;
            }

        }
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < k; ++i) {
//            System.out.println("charCount:" + charCount[i]);
            if(charCount[i] >= n / 2) {
                res.append("0");
            } else {
                res.append("1");
            }
        }
        System.out.println(res.toString());
    }
}
