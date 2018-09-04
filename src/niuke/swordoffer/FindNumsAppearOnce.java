package niuke.swordoffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * test
 *
 * @author nanj
 * @date 2018/9/4
 */
public class FindNumsAppearOnce {
    public void findNumsAppearOnce(int[] array, int num1[], int num2[]) {
        List<Integer> arrayList = new LinkedList<>();

        for (int x :
                array) {
            if (arrayList.contains(x)) {
                arrayList.remove((Integer) x);
//                arrayList.
            } else {
                arrayList.add(x);
            }
        }

        num1[0] = ((LinkedList<Integer>) arrayList).getFirst();
        num2[0] = ((LinkedList<Integer>) arrayList).getLast();
    }

    public static void main(String[] args) {
        int[] array = {2,4,3,6,3,2,5,5};
        int[] num1 = new int[1];
        int[] num2 = new int[1];
        new FindNumsAppearOnce().findNumsAppearOnce(array, num1, num2);
        System.out.println(num1[0]);
        System.out.println(num2[0]);

    }

}
