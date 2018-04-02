package huawei;

import java.util.Map;
import java.util.Scanner;

/**
 * test class
 *
 * @author nanj
 * @date 2018/3/30
 */
public class HexToDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String hex = sc.next();
            int len = hex.length();
            int dec = 0;

            for(int i = 2; i < len; ++i) {
                String currentStr = hex.substring(i, i + 1);
                int fold = parse(currentStr);
//                System.out.println("fold:" + fold);
//                System.out.println("currentStr:" + currentStr);
//                System.out.println("hex:" + hex);
                dec += Math.pow(16, len - 1 - i) * fold;
            }

            System.out.println(dec);

        }


    }

    public static int parse(String str) {
        switch (str){
            case "1" :
                return 1;
            case "2" :
                return 2;
            case "3" :
                return 3;
            case "4" :
                return 4;
            case "5" :
                return 5;
            case "6" :
                return 6;
            case "7" :
                return 7;
            case "8" :
                return 8;
            case "9" :
                return 9;

            case "A" :
                return 10;
            case "B" :
                return 11;
            case "C" :
                return 12;
            case "D" :
                return 13;
            case "E" :
                return 14;
            case "F" :
                return 15;

            default:
                return 0;

        }
    }

}
