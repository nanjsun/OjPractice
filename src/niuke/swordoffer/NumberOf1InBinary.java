package niuke.swordoffer;

/**
 * test
 *
 * @author nanj
 * @date 2018/5/18
 *
 * 思路：
 * 1、采用target 顺次右移 而不是n左移的原因是：如果n 是负数，左移的话会在最高位补1，而不是0， 导致最终结果为0xFFFFFFFF
 * 2、把一个整数减去1，再和原整数做与运算，会吧该整数最右边的1变成0.那么一个整数的二进制表示中有多少个1，
 * 就可以进行多少次这样的操作。
 *
 *
 */
public class NumberOf1InBinary {
    public static void main(String[] args) {
        NumberOf1InBinary numberOf1InBinary = new NumberOf1InBinary();
        int res = numberOf1InBinary.NumberOf1(-2);
        System.out.println(res);
    }


    public int NumberOf1(int n) {
        int res = 0;
        int target = 1;
        for(int i = 0 ; i < 32; ++i){
            if((n & target) != 0){
                res ++;
            }
            target = target << 1;
        }

        return res;
    }

    public int NumberOfOne(int n) {
        int count = 0;
        while (n != 0){
            n = (n -1) & n;
        }
        return count;
    }
}
