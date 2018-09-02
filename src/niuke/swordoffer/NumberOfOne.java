package niuke.swordoffer;

/**
 * test
 *
 * @author nanj
 * @date 2018/9/1
 */
public class NumberOfOne {
    public int NumberOf1Between1AndN_Solution(int n) {
        int m = n;
        int len = String.valueOf(n).length();
        System.out.println(len);
        int sum = 0;
        for(int i = len - 1; i >= 0; --i) {
            int count = 0;
            n = n % (int)Math.pow(10, i);
            System.out.println("n: " + n);
            System.out.println("i: " + i);

            if(n >= 2 * Math.pow(10, i)){
                count += Math.pow(10, i);
//                System.out.println(count);
            } else {
                count += (n - Math.pow(10, i) + 1);
            }
            System.out.println("count: " + count);
            if(n > 0) {
                sum += count * (m / n);
            };
        }
        return sum;
    }

    public static void main(String[] args) {
        int res = new NumberOfOne().NumberOf1Between1AndN_Solution(55);
        System.out.println(res);
    }
}
