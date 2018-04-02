package huawei;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * test class
 *
 * @author nanj
 * @date 2018/3/30
 */
public class Drink {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> res = new LinkedList<>();
        while (sc.hasNextInt()) {
            int empty = sc.nextInt();
            if(empty == 0) {
                break;
            }
            res.add(empty / 2);


        }

        for(int i = 0; i < res.size(); ++i) {
            System.out.println(res.get(i));
        }
    }
}
