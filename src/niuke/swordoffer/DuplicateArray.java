package niuke.swordoffer;

import org.omg.CORBA.INTERNAL;

import java.util.HashSet;
import java.util.Set;

/**
 * test
 *
 * @author nanj
 * @date 2018/9/20
 */
public class DuplicateArray {


    public static void main(String[] args) {
        DuplicateArray da = new DuplicateArray();
        int numbers[] = {};
        int length = 0;
        int [] duplication = new int[1];
        System.out.println(da.duplicate(numbers, length, duplication));
        System.out.println(duplication[0]);
    }


    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if(length < 2 || numbers == null) {
            duplication[0] = -1;
            return false;
        }
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < numbers.length; i ++) {
            set.add(numbers[i]);
            if(set.size() <= i) {
                duplication[0] = numbers[i];
                return true;
            }
        }
        return false;

    }

}
