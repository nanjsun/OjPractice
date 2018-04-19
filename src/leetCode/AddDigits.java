package leetCode;

//258. Add Digits
//
//        Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
//
//        For example:
//
//        Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
//
//        Follow up:
//        Could you do it without any loop/recursion in O(1) runtime?
//
//        Credits:
//        Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.


public class AddDigits {
    public int addDigits(int num){
        int res = 0;
        res = num - (9 * ((int)Math.ceil((num - 1) / 9)));
        return res;
    }

    public static void main(String[] args) {
        AddDigits addDigits = new AddDigits();
        int num = 2035;
        int res = addDigits.addDigits(num);

        System.out.println(num);
        System.out.println(res);
    }
}
