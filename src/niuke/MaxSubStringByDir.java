package niuke;

import java.util.Scanner;

/**
 * test
 *
 * @author nanj
 * @date 2018/4/19
 */
public class MaxSubStringByDir {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        findMax(input);


    }

    public static void findMax(String input) {
        int len = input.length();
        char max = input.charAt(0);
        for(int i = 1; i < len; ++i) {
            if(input.charAt(i) > max) {
                max = input.charAt(i);
            }
        }

        for(int i = 0; i < len; ++i) {
            if(input.charAt(i) == max) {
                System.out.print(max);
                if(i < len -1){
                    String sub = input.substring(i + 1, len);
                    findMax(sub);
                    break;
                }


            }

        }

    }
}

