package huawei;

import java.util.*;

/**
 * test class
 *
 * @author nanj
 * @date 2018/3/30
 */
public class Query {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int count = sc.nextInt();
            Set<Integer> res = new TreeSet<>();

            for(int i = 0; i < count; ++i) {
                int random = sc.nextInt();
                res.add(random);
            }

            Iterator<Integer> it = res.iterator();
            for(int i = 0; i < res.size(); ++i) {
//            System.out.println(res.size());
                System.out.println(it.next());
            }
        }

    }
}
