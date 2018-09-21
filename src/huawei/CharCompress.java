package huawei;

import java.util.*;

/**
 * test
 *
 * @author nanj
 * @date 2018/9/5
 */
public class CharCompress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
        String str = "a3b3c2";

        CharCompress charCompress = new CharCompress();
        charCompress.unzip(str);

    }

    public String unzip(String str) {
        char[] originChars = str.toCharArray();

        TreeMap<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < originChars.length; ++i) {
            char key = 'a';
//            ArrayList<Integer> valueList = new ArrayList<>();
            StringBuilder valueSb = new StringBuilder();
            if(Character.isLetter(originChars[i])) {
                key = originChars[i];
                i ++;
            }
            while (i < originChars.length && Character.isDigit(originChars[i])) {
                valueSb.append(i);
                i++;
            }
            System.out.println(valueSb.toString());
            int value = 0;
            if(valueSb.length() > 0) {
                value = Integer.valueOf(valueSb.toString());
            }
            map.put(key, value);
            i --;
        }

        for (Map.Entry x :
                map.entrySet()) {
            System.out.println(x.getKey() + ":" + x.getValue());
        }


        LinkedList<Character> minChars = new LinkedList<>();
        int min = 1000;
        StringBuilder sb = new StringBuilder();

        while (!map.isEmpty()) {
            min = 100;

            for (Map.Entry entry : map.entrySet()) {
                System.out.println(entry.getKey() + " :" + (int)entry.getValue());
                if ((int) entry.getValue() < min) {
                    minChars.clear();
                    min = (int) entry.getValue();
                    minChars.add((char) entry.getKey());
                    continue;
                }
                if ((int) entry.getValue() == min) {
                    minChars.add((char) entry.getKey());
                }
            }

            while (!minChars.isEmpty()) {
                char currentChar = minChars.getFirst();
                for (int i = 0; i < min; ++i) {
                    sb.append(currentChar);
                }
                minChars.removeFirst();
                map.remove(currentChar);
            }
        }
        System.out.println(sb);

        return sb.toString();
    }
}
