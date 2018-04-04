package leetCode;

/**
 * test class
 *
 * @author nanj
 * @date 2018/4/4
 */
public class NumberOfLinesToWriteString {

    public static void main(String[] args) {
        int[] widths = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String S = "abcdefghijklmnopqrstuvwxyz";
        NumberOfLinesToWriteString numberOfLinesToWriteString = new NumberOfLinesToWriteString();

        int[] res = numberOfLinesToWriteString.numberOfLines(widths, S);
        System.out.println(res[0] + " " + res[1]);

    }

    public int[] numberOfLines(int[] widths, String S) {
        int[] res = new int[2];
        final int maxLength = 100;
        int remainUnits = maxLength;

        res[0] = 1;
        for(int i = 0; i < S.length(); ++i) {
            if(widths[S.charAt(i) - 97] <= remainUnits) {
                remainUnits -= widths[S.charAt(i) - 97];
                res[1] += widths[S.charAt(i) - 97];
//                System.out.println("i:" + i + ":" + S.charAt(i) + " -res: " + res[1]);
//                res[1] = maxLength - remainUnits;
            } else {
                res[0] ++;
                res[1] = 0;
                remainUnits = maxLength;

                remainUnits -= widths[S.charAt(i) - 97];
                res[1] += widths[S.charAt(i) - 97];
            }
        }
        return res;
    }

}
