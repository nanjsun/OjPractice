package niuke.swordoffer;

import java.util.*;

/**
 * test
 *
 * @author nanj
 * @date 2018/8/25
 */
public class MoreThanHalfNumSolution {
    public int MoreThanHalfNum_Solution(int [] array) {
        int length = array.length;

        Map<Integer, Integer> map = new TreeMap<>();
        int maxNum = 0;
        int maxValue = 0;

        for(int x : array) {
            if(map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }

            if(map.get(x) > maxNum) {
                maxNum = map.get(x);
                maxValue = x;
            }
        }

        int res;
        if(maxNum > length) {
            res = maxNum;
        } else {
            res = 0;
        }
        return res;
    }
}
