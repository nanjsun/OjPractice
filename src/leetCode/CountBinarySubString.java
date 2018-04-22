package leetCode;

/**
 * test
 *
 * @author nanj
 * @date 2018/4/22
 *
 *  * LeetCode 696. Count Binary Substrings
 *  *
 *  * Give a string s, count the number of non-empty (contiguous) substrings that have the same number of 0's and 1's, and all the 0's and all the 1's in these substrings are grouped consecutively.
 *  *
 *  * Substrings that occur multiple times are counted the number of times they occur.
 *  *
 *  * Example 1:
 *  * Input: "00110011"
 *  * Output: 6
 *  * Explanation: There are 6 substrings that have equal number of consecutive 1's and 0's: "0011", "01", "1100", "10", "0011", and "01".
 *  *
 *  * Notice that some of these substrings repeat and are counted the number of times they occur.
 *  *
 *  * Also, "00110011" is not a valid substring because all the 0's (and 1's) are not grouped together.
 *  * Example 2:
 *  * Input: "10101"
 *  * Output: 4
 *  * Explanation: There are 4 substrings: "10", "01", "10", "01" that have equal number of consecutive 1's and 0's.
 *  * Note:
 *  *
 *  * s.length will be between 1 and 50,000.
 *  * s will only consist of "0" or "1" characters.
 *
 */

public class CountBinarySubString {
    public static void main(String[] args) {

        String str = "10101";
        CountBinarySubString cbss = new CountBinarySubString();
        int res = cbss.countBinarySubStrings(str);

        System.out.println(res);

    }

    public int countBinarySubStrings(String s) {
        int res = 0;
        int len = s.length();
//        int count = 1;
        int i = 1;

        while (i < len ) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                res++;
//                System.out.println("i: " + i);
//                System.out.println("res: " + res);
                int j = 0;
                while ((i - 2 - j) >= 0 && (i + j + 1) < len) {
                    if (s.charAt(i - 2 - j) == s.charAt(i - 1) && s.charAt(i + 1 + j) == s.charAt(i)) {
                        res++;
                        j++;

                    } else {
                        break;
                    }

                }
            }

            i++;

        }
        return res;
    }
}
