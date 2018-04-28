package leetCode;

/**
 * test
 *
 * @author nanj
 * @date 2018/4/26
 */
public class PalindromicSubstrings647 {


    public static void main(String[] args) {
        PalindromicSubstrings647 palindromicSubstrings647 = new PalindromicSubstrings647();
        String str = "bbccaacacdbdbcbcbbbcbadcbdddbabaddbcadb";

//        String str = "abcc";
        int res = palindromicSubstrings647.countSubstrings(str);
        System.out.println(res);
    }


    public int countSubstrings(String s) {
        int sLen = s.length();
        char[] cArr = s.toCharArray();

        int totalPallindromes = 0;

        boolean[][] dp = new boolean[sLen][sLen];

        // Single length pallindroms
        for (int i = 0; i < sLen; i++) {
            dp[i][i] = true;
            totalPallindromes++;
        }

        // 2 length pallindromes
        for (int i = 0; i < sLen - 1; i++) {
            if (cArr[i] == cArr[i + 1]) {
                dp[i][i + 1] = true;
                totalPallindromes++;
            }
        }

        // Lengths > 3

        for (int subLen = 2; subLen < sLen; subLen++) {

            for (int i = 0; i < sLen - subLen; i++) {

                int j = i + subLen;

                if (dp[i + 1][j - 1] && cArr[i] == cArr[j]) {
                    dp[i][j] = true;
                    totalPallindromes++;
                }
            }
        }
        return totalPallindromes;

    }

}
