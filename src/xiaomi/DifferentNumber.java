package xiaomi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * test
 *
 * @author nanj
 * @date 2018/9/20
 */
public class DifferentNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> input = new ArrayList<>();
        for(int i = 0; i < 100000; i ++) {
            if(sc.hasNext()) {
                String temp = sc.next();
                if("END".equals(temp)) {
                    break;
                }
                if(temp != null && temp.length() > 0) {
                    input.add(temp);
                }
            }
        }

//        for (String str :
//                input) {
//            System.out.println(str);
//        }
        HashSet<Long> set = new HashSet<>();
        long[] tenNumber = new long[input.size()];
        long different = -1;
        for(int i = 0; i < input.size(); ++i) {
            tenNumber[i] = convertToTen(input.get(i));
            set.add(tenNumber[i]);
            if(set.size() > 1) {
                if(different == -1) {
                    if(i >= 2) {
                        different = tenNumber[i];
//                    System.out.println(input.get(i));
////                    return;
                    } else {
                        tenNumber[2] = convertToTen(input.get(2));
                        if(tenNumber[2] == tenNumber[0]) {
                            different = tenNumber[1];
//
//                        System.out.println(input.get(1));
////                        return;
                        } else {
                            different = tenNumber[0];
//                        System.out.println(input.get(0));
////                        return;
                        }
                    }
                }
            }
        }
//        System.out.println("res");

        for(int i = 0; i < input.size(); ++i) {
            if(tenNumber[i] == different) {
                System.out.println(input.get(i));
            }
        }
        if(set.size() > 2) {
            System.out.println("None");
        }

        if(different == -1) {
            System.out.println("None");
        }


//        System.out.println("None");
    }

    private  static String numStr = "0123456789abcdefghi";

    public static long convertToTen(String str) {


        String number;
        int n;

        n = Integer.valueOf(str.split("#")[0]);
        number = str.split("#")[1];

//        System.out.println("number:" + number + "    n:" + n);

        char[] ch = number.toCharArray();
        int len = ch.length;
        long result = 0;
        if (n == 10) {
            return Long.parseLong(number);
        }
        long base = 1;
        for (int i = len - 1; i >= 0; i--) {
            int index = numStr.indexOf(ch[i]);
            result += index * base;
            base *= n;
        }
        return result;
    }
}
