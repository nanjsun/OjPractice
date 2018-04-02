package leetCode;

import java.util.LinkedList;
import java.util.List;

/**
 * test class
 *
 * @author nanj
 * @date 2018/4/2
 */

//
//A self-dividing number is a number that is divisible by every digit it contains.
//
//        For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
//
//        Also, a self-dividing number is not allowed to contain the digit zero.
//
//        Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.
//
//        Example 1:
//        Input:
//        left = 1, right = 22
//        Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
//        Note:
//
//        The boundaries of each input argument are 1 <= left <= right <= 10000.
public class SelfDividingNumbers {

    public static void main(String[] args) {
        List<Integer> res = new LinkedList<>();

        SelfDividingNumbers selfDividingNumbers = new SelfDividingNumbers();
        res = selfDividingNumbers.selfDividingNumbers(1, 22);

        System.out.println(res);
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new LinkedList<>();
        for(int i = left; i < right + 1; ++i) {
            if (isSelfDivid(i)) {
                res.add(i);
            }
        }



        return res;
    }

    private boolean isSelfDivid(int input) {

        final String ZERO = "0";
        String str = input + "";
        if(str.contains(ZERO)){
            return false;
        }
        char[] arr = str.toCharArray();

//        System.out.println("input:" + input);

        for(int i = 0; i < arr.length; ++i) {
//            System.out.println("arr[i]:" + arr[i]);
//            System.out.println("input % (int)arr[i]:" + (input % (arr[i] - 48)));
//            System.out.println("input % 2:" + (12 % 6));
            if(input % (arr[i] - 48) != 0){
                return false;
            }
        }
        return true;

    }



}
