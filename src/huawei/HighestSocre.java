package huawei;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * test class
 *
 * @author nanj
 * @date 2018/3/28
 */
public class HighestSocre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int m = 0;

        while (sc.hasNextInt()) {
            n = sc.nextInt();
            m = sc.nextInt();
            int[] scores = new int[n];
            List<Integer> res = new LinkedList<>();
            for(int i = 0; i < n; ++i) {
                scores[i] = sc.nextInt();
            }
            for(int i = 0; i < m; ++i) {
                String action = sc.next();
                int A = sc.nextInt();
                int B = sc.nextInt();
//            System.out.println(action);
                if(action.equals("U")) {
//                System.out.println("update date");
//                System.out.println("A - 1 :" + scores[A - 1]);
                    scores[A - 1] = B;
//                System.out.println("A - 1 :" + scores[A - 1]);
                }
                if(action.equals("Q")) {

                    if(A > B) {
                        int temp = B;
                        B = A;
                        A = temp;
                    }
//                System.out.println("A:" + A + ",B :" + B);
                    int queryLenth = B - A + 1;
                    int highestScore = 0;
                    for(int j = 0; j < queryLenth; ++j) {
                        if(scores[A + j - 1] > highestScore) {
                            highestScore = scores[A + j -1];
//                        System.out.println("highestScore:" + highestScore);
                        }
                    }
                    res.add(highestScore);
//                System.out.println(highestScore);
                }
            }

            for(int i = 0; i < res.size(); ++i) {
                System.out.println(res.get(i));
            }


        }



    }


}
