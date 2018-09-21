package niuke.swordoffer;

/**
 * test
 *
 * @author nanj
 * @date 2018/9/20
 */
public class RegularExpression {
    public boolean match(char[] str, char[] pattern){
        int strIndex = 0;
        int patternIndex = 0;

        if(pattern.length == patternIndex) {
            if (str.length == strIndex) {
                return true;
            } else {
                return false;
            }
        }
        if(patternIndex < pattern.length - 1) {
            if(pattern[patternIndex + 1] != '*') {
                if(str[strIndex] == pattern[patternIndex] || (str[strIndex] != '\0' && pattern[patternIndex] == '.')) {
                    return match(str, pattern);
                }
            }
        }
        return true;
    }
}
