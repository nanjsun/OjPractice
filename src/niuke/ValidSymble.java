package niuke;

import java.util.Scanner;

/**
 * test class
 *
 * @author nanj
 * @date 2018/4/9
 */
public class ValidSymble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] symbol = new String[n];
        for(int i = 0; i < n; ++i) {
            symbol[i] = sc.next();
        }

        for(int i = 0; i < n; ++i) {
            long count = 0;
            boolean res = true;
            for(int j = 0; j < symbol[i].length(); ++j) {
                char[] chars = symbol[i].toCharArray();
                if(chars[j] == '(') {
                    count ++;
                } else {
                    count --;
                }
                if(count < -1){
                    res = false;
//                    System.out.println("No");
                    break;
                }
            }


            if(res) {
                System.out.println("Yes");

            } else {
                System.out.println("No");

            }

        }
    }
}
