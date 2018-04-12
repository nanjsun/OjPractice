package huawei;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * test class
 *
 * @author nanj
 * @date 2018/4/10
 */
public class SortString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        String str = sc.next();

        Map<Character, Integer> stringMap = new TreeMap<>();

        for (int i = 0; i < str.length(); ++i) {
            if(stringMap.containsKey(str.charAt(i))){
                stringMap.replace(str.charAt(i), stringMap.get(str.charAt(i)) + 1);
            } else {
                stringMap.put(str.charAt(i), 1);
            }
        }

        boolean endFlag = false;
        while (!endFlag){
            endFlag = true;
            for(Map.Entry<Character, Integer> entry: stringMap.entrySet()){
                if(entry.getValue() != 0) {
                    System.out.print(entry.getKey());
                    stringMap.replace(entry.getKey(), entry.getValue() - 1);
                    endFlag = false;

                }
            }


        }

//        System.out.println("str:" + str);


    }
}
