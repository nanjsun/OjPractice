package leetCode;

/**
 * test
 *
 * @author nanj
 * @date 2018/4/28
 */
public class MinimumASCIIDeleteSumForTwoStrings712 {



    public int minimumDeleteSum(String s1, String s2) {
        char[] cArray1 = s1.toCharArray();
        char[] cArray2 = s2.toCharArray();
        char[] commonArray1 = new char[s1.length()];
        char[] commonArray2 = new char[s2.length()];

        int index = 0;
        for(char c1 : cArray1) {
            for(char c2 : cArray2) {
                if(c1 == c2) {
                    commonArray1[index] = c1;
                    index ++;
                }
            }
        }
        index = 0;
        for(char c2 : cArray2) {
            for(char c1 : cArray1) {
                if(c1 == c2) {
                    commonArray2[index] = c1;
                    index ++;
                }
            }
        }




        return 0;

    }
}
