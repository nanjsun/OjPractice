package niuke.swordoffer;

import java.util.LinkedList;
import java.util.List;

/**
 * test
 *
 * @author nanj
 * @date 2018/9/4
 */
public class FirstNotRepeatingChar {

    public int findFirstNotRepeatingChar(String str) {
        List<Character> repeatList = new LinkedList<>();


        for(int i = 0; i < str.length() - 1; ++i) {
            if(repeatList.contains(str.charAt(i))) {
                continue;
            }
            for(int j = i + 1; j < str.length(); ++j) {
                if (repeatList.contains(str.charAt(j))) {
                    continue;
                }
                if(str.charAt(i) == str.charAt(j)) {
                    repeatList.add(str.charAt(j));
//                    continue;
                }
            }
            if(!repeatList.contains(str.charAt(i))) {
                return i;

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstNotRepeatingChar firstNotRepeatingChar = new FirstNotRepeatingChar();
        String str = "adaafegsad";
        int res = firstNotRepeatingChar.findFirstNotRepeatingChar(str);
        System.out.println(res);

    }

}
