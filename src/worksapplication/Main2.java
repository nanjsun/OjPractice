package worksapplication;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * test
 *
 * @author nanj
 * @date 2018/9/15
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i ++) {
            a[i] = in.nextInt();
        }
        long ans = 0;
        ArrayList<Integer> dupRecord = new ArrayList<>();
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < n; ++j) {
                if(a[i] == a[j]) {
                    if(dupRecord.contains(a[i])) {
                        ans ++;
                        continue;
                    }
                }
                if (i != j) {

                    long x = Long.valueOf("" + a[i] + a[j]);
                    if(x % 7 == 0) {
                        if(a[i] == a[j]) {
                            dupRecord.add(a[i]);
                        }
                        ans ++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
