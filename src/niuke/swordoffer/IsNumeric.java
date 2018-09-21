package niuke.swordoffer;

/**
 * test
 *
 * @author nanj
 * @date 2018/9/20
 */
public class IsNumeric {

    public static void main(String[] args) {
        IsNumeric isNumeric = new IsNumeric();

        char[] str = {'1','2', '0'};

        boolean res = isNumeric.isNumeric(str);
        System.out.println(res);
    }

    public boolean isNumeric(char[] str) {


        String string = String.valueOf(str);
        return string.matches("[\\+\\-]?\\d*(\\.\\d+)?([eE][\\+\\-]?\\d+)?");
    }
}
