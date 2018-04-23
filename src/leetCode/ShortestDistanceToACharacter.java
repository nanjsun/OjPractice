package leetCode;

/**
 * test
 *
 * @author nanj
 * @date 2018/4/23
 *
 *821. Shortest Distance to a Character
 *
 *Given a string S and a character C, return an array of integers representing the shortest distance from the character C in the string.
 *
 * Example 1:
 *
 * Input: S = "loveleetcode", C = 'e'
 * Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
 *
 *
 * Note:
 *
 * S string length is in [1, 10000].
 * C is a single character, and guaranteed to be in string S.
 * All letters in S and C are lowercase.
 *
 */
public class ShortestDistanceToACharacter {

    public static void main(String[] args) {
        ShortestDistanceToACharacter sda = new ShortestDistanceToACharacter();

        String S = "loveleetcode";
        char c = 'e';
        int[] res = sda.shortestToChars(S, c);

        for(int i : res){
            System.out.print(i + ",");
        }
    }


    public int[] shortestToChars(String S, char C) {
        int[] res = new int[S.length()];

        for(int i = 0; i < S.length(); ++i) {
            if(S.charAt(i) == C) {
                res[i] = 0;
            } else {
                res[i] = -1;
            }
        }

        boolean zeroFlag = false;
        int count = -1;
        for(int i = 0; i < S.length(); ++i) {
            if(res[i] == 0) {
                zeroFlag = true;
                count = 0;
            }
            if(zeroFlag) {
                res[i] = count;
                count ++;
            }
        }

        for(int i = S.length() - 1; i >= 0; --i) {
            if(res[i] == 0) {
                zeroFlag = true;
                count = 0;
            }
            if(zeroFlag) {
                if(res[i] > count || res[i] == -1) {
                    res[i] = count;
                }
                count++;
            }
        }




        return res;
    }


}

