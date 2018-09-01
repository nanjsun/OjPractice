package niuke.swordoffer;

import java.util.ArrayList;

/**
 * test
 *
 * @author nanj
 * @date 2018/8/25
 */
public class MaxInWindows {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        int max;
        ArrayList<Integer> list = new ArrayList<>();

        if(size == 0) {
            return list;
        }

        for(int i = size - 1; i < num.length; i++) {
            max = num[i];
            for(int j = 1; j < size; ++j) {
                if(num[i - j] > max) {
                    max = num[i - j];
                }
            }
            list.add(max);

        }

        return list;

    }
}
