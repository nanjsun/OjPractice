package niuke.swordoffer;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * test
 *
 * @author nanj
 * @date 2018/9/2
 */
public class UglyNumber {
    final int d[] = {2, 3, 5};

    public int getUglyNumberSolution(int index) {
        if (index == 0) return 0;
        int a[] = new int[index];
        a[0] = 1;
        int p[] = new int[]{0, 0, 0};
        int num[] = new int[]{2, 3, 5};
        int cur = 1;

        while (cur < index) {
            int m = finMin(num[0], num[1], num[2]);
            if (a[cur - 1] < num[m])
                a[cur++] = num[m];
            p[m] += 1;
            num[m] = a[p[m]] * d[m];
        }
        return a[index - 1];
    }

    private int finMin(int num2, int num3, int num5) {
        int min = Math.min(num2, Math.min(num3, num5));
        return min == num2 ? 0 : min == num3 ? 1 : 2;
    }

    public static void main(String[] args) {
//        for(int i = 1; i < 100; ++i) {
//            int res = new UglyNumber().getUglyNumberSolution(i);
//            System.out.println(i + ":" + res);
//
//        }
        int i = 1500;
        int res = new UglyNumber().getUglyNumberSolution(i);
        System.out.println(i + ":" + res);


    }

}
