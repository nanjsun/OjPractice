

/**
 * test class
 *
 * @author nanj
 * @date 2018/3/13
 */

//public class Main1111 {
//    public int minCost(int[] heaps){
//        int result = 19;
//
//
//        return result;
//    }
//
//
//
//    public static void main(String[] args) {
//        Main1111 main = new Main1111();
//        Scanner sc = new Scanner(System.in);
//        int count = sc.nextInt();
//        sc.nextLine();
//        int[] result = new int[count];
//
//        for(int i = 0; i < count; ++ i){
//            int heapCount = sc.nextInt();
////            System.out.println(heapCount);
//            int[] heaps = new int[heapCount];
//            sc.nextLine();
//            for(int j = 0; j < heapCount; ++ j){
//                heaps[j] = sc.nextInt();
////                sc.nextLine();
//            }
//            result[i] = main.minCost(heaps);
//
//        }
//
//        for(int k = 0; k < count; ++ k){
//            System.out.println(result[k]);
//        }
//
//    }
//}








//import java.util.Scanner;
//public class Main1111 {
//    public int findMaxSubString(String s1, String s2) {
//        char[] c1 = s1.toCharArray();
//        char[] c2 = s2.toCharArray();
////        System.out.println("c1 length" + c1.length);
////
////        System.out.println("c2 length" + c2.length);
//
//        int[][] dp = new int[c1.length + 1][c2.length + 1];
////        System.out.println("dp[1][1]:" + dp[1][1]);
//
//        int max = 0;
//
//        for(int i = 1; i < c1.length + 1; ++ i){
//            for(int j = 1; j < c2.length + 1; ++ j){
//                if(c1[i - 1] == c2[j - 1]) {
//                    dp[i][j] = dp[i - 1][j - 1] + 1;
//                    if(dp[i][j] > max){
//                        max = dp[i][j];
//                    }
////                    System.out.println("dp" + dp[i][j]);
//                }
//            }
//        }
////        System.out.println("max:" + max);
//        return max;
//    }
//
//
//    public static void main(String[] args){
//        Main1111 main = new Main1111();
////        String string1= new String("abcdefgh");
////        String string2= new String("ccabcdegd");
////        System.out.println("result:" + main.findMaxSubString(string1,string2));
//        Scanner sc = new Scanner(System.in);
//        int group = sc.nextInt();
////        System.out.println(group);
//        sc.nextLine();
//
//        int results[] = new int[group];
//
//        for(int i = 0; i < group ; ++ i){
//            if(sc.hasNext()) {
//                String stringA = sc.nextLine();
////                System.out.println(i + "a:" + stringA);
//                String stringB = sc.nextLine();
////                System.out.println(i + "b:" + stringB);
//
////                System.out.println("result:" + main.findMaxSubString(stringA,stringB));
//                results[i] = main.findMaxSubString(stringA, stringB);
//            }
//        }
//        for(int j = 0; j < group; ++ j){
//            System.out.println(results[j]);
//        }
//    }
//}
//


public class Main1111 {

    public int findMaxSubString(String strA, String strB) {
        int[][] bp = new int[strA.length()][strB.length()];
        char[] charA = strA.toCharArray();
        char[] charB = strB.toCharArray();

        int maxSubStringLength = 0;

        for(int i = 1; i <= strA.length(); ++ i) {
            for(int j = 1; j <= strB.length(); ++j) {
                if(charA[i - 1] == charB[j - 1]) {
                    bp[i][j] = bp[i - 1][j - 1] + 1;
                    if(bp[i][j] > maxSubStringLength) {
                        maxSubStringLength = bp[i][j];
                    }
                }
            }
        }

        return maxSubStringLength;
    }

    public static void main(String[] args) {
        Main1111 main = new Main1111();
        String strA = "abcdefgh";
        String strB = "bcdefjjj";

        int result = main.findMaxSubString(strA, strB);
        System.out.println(result);
    }
}














//
//
//import java.util.Scanner;
//public class Main1111 {
//
//    public int fiber(int n, int a , int b){
//
//        if(n == 0) {
//            return a;
//        }
//        return fiber(n - 1, b,a + b );
//    }
//    public static void main(String[] args){
//        Main1111 main = new Main1111();
//        Scanner sc = new Scanner(System.in);
//        int month = sc.nextInt();
//        System.out.println(main.fiber(month, 0, 1));
//
//    }
//}
