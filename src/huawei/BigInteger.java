package huawei;

import java.util.Scanner;

/**
 * test
 *
 * @author nanj
 * @date 2018/9/5
 */
public class BigInteger {
    static int N = 100;
    static int a[] = new int[N];
    static int b[] = new int[N];
    static int c[] = new int[N + 1];
    static String s1;
    static String s2;

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        BigInteger demo = new BigInteger();
        demo.Input();
        demo.Add(a, b, c);
        demo.Output();
    }

    private void Output() {
        int flag = N;
        while (c[flag] == 0) {
            flag--;
            if (flag == -1) {
                System.out.println("a");
                return;
            }
        }
        for (int i = flag; i >= 0; i--) {
            System.out.print((char)(c[i] + 97));
        }
        System.out.println();
    }


    private void Input() {
        Scanner scanner = new Scanner(System.in);
        s1 = scanner.nextLine();
        s2 = scanner.nextLine();
        GetDigit(s1, a);
        GetDigit(s2, b);
    }

    private void GetDigit(String s, int a[]) {
        int len = s.length();
        for (int i = 0; i < len; i++) {
            a[i] = s.charAt(len - 1 - i) - 'a';
        }
    }

    private void Add(int a[], int b[], int c[]) {
        for (int i = 0; i < N; i++) {
            c[i] = a[i] + b[i];
        }
        for (int i = 0; i < N; i++) {
            c[i + 1] += c[i] / 26;
            c[i] = c[i] % 26;
        }
    }

}
