package niuke.swordoffer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * test
 *
 * @author nanj
 * @date 2018/8/25
 */
public class GetLeastNumbers {
    public static void main(String[] args) {

    }

    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {

        ArrayList<Integer> list = new ArrayList<>();

        if (k > input.length) {
            return list;
        }

        Arrays.sort(input);
        for(int i = 0; i < k; i ++) {
            list.add(input[i]);
        }

        return list;


    }

}
