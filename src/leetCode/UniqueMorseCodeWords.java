package leetCode;

import java.util.Set;
import java.util.TreeSet;

/**
 * test class
 *
 * @author nanj
 * @date 2018/4/1
 */
public class UniqueMorseCodeWords {


    public int uniqueMorseRepresentations(String[] words) {
        final String[] morseTabel = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        int res = 0;

        Set<String> morseSet = new TreeSet<>();

        for(String word : words) {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < word.length(); ++i) {
                char currentChar = word.charAt(i);
                sb.append(morseTabel[currentChar - 97]);
            }

            morseSet.add(sb.toString());
        }

        res = morseSet.size();



        return res;
    }
}
