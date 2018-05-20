package niuke.swordoffer;

/**
 * test
 *
 * @author nanj
 * @date 2018/5/20
 *
 * 思路：
 * 首先要判断指数是正数还是负数， 如果是负数，应把指数取反，然后在最终返回时取倒数 ， 此时问题转换成指数为正数的问题；
 * 传统解法是将正数逐个相乘得到最终的power值，但是在时间复杂度过高，可以采用将指数除二的方式，降低时间复杂度、
 *
 *
 */
public class Power16 {
    public static void main(String[] args) {
        Power16 power16 = new Power16();
        double res = power16.power(10, 0);
        System.out.println(res);
    }
    public double power(double base, int exponent) {
        boolean negative = false;
        if(exponent < 0){
            exponent = - exponent;
            negative = true;
        }
        if(negative){
            return 1 / simplePower(base, exponent);
        } else {
            return simplePower(base, exponent);
        }
    }

    public double simplePower(double base, int exponent) {


        if(exponent == 0) {
            return 1;
        }
        if(exponent == 1) {
            return base;
        }
        if(exponent % 2 == 0) {
            double single = simplePower(base, exponent / 2);
            return single * single;
        }else {
            double single = simplePower(base, (exponent -1) / 2);
            return single * single * base;
        }

    }
}
