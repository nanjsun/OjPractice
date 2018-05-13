package niuke.swordoffer;

import java.io.FileOutputStream;

/**
 * test
 *
 * @author nanj
 * @date 2018/5/10
 */
public class FibonacciArray10 {
    public static void main(String[] args) {
        FibonacciArray10 fibonacciArray10 = new FibonacciArray10();
        int res = fibonacciArray10.Fibonacci(4);
        System.out.println(res);
    }

    public int Fibonacci(int n) {
        return search(0, 1, n);
    }

    private int search(int a, int b, int n){
        if(n == 0) {
            return a;
        } else {
            return search(b, a+b, n - 1);
        }
    }
}
