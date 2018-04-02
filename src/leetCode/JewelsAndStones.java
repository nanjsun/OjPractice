package leetCode;

/**
 * test class
 *
 * @author nanj
 * @date 2018/4/1
 */
public class JewelsAndStones {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        String J = "aA";
        String S = "aAAbbbb";
        solution1.numJewelsInStones(J, S);
    }
}


class Solution1 {
    public int numJewelsInStones(String J, String S) {
        int res = 0;
        char[] jArray = J.toCharArray();
        String replacedS = null;
        for(int i = 0; i < jArray.length; ++i) {
            S = S.replace(jArray[i], '0');
        }

//        System.out.println(S);

        for(int i = 0; i < S.length(); ++i) {
            if(S.charAt(i) == '0'){
                res++;
            }
        }

        System.out.println(res);
        return res;

    }
}