package niuke.swordoffer;

/**
 * test
 *
 * @author nanj
 * @date 2018/5/3
 */
public class ReplaceSpace5 {
    public static void main(String[] args) {
        ReplaceSpace5 replaceSpace5 = new ReplaceSpace5();

        StringBuffer str = new StringBuffer("hello wo rl d!");
        System.out.println(str.toString());


        String res = replaceSpace5.replaceSpace(str);
        System.out.println(res);
    }


    public String replaceSpace(StringBuffer str) {
        int len = str.length();
//        System.out.println("len_before: " + len);
//        int[] arg
        int spaceCount = 0;
        for(int i = 0; i < len; ++i) {
            if(str.charAt(i) == ' '){
                spaceCount ++;
            }
        }
        str.setLength(len + spaceCount * 2);
//        System.out.println("len_after: " + str.length());

        int j = str.length() - 1;
        for(int i = len - 1; i >= 0; --i) {
            if(str.charAt(i) == ' '){
                str.setCharAt(j, '0');
                str.setCharAt(j - 1, '2');
                str.setCharAt(j - 2, '%');
                j -= 3;
            }else {
                str.setCharAt(j, str.charAt(i));
                j --;
            }
        }

        return str.toString();
    }
}
