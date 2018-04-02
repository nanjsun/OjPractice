import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * test class
 *
 * @author nanj
 * @date 2018/3/26
 */
public class Main1 {
    private static List<Character> res = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        if(sc.hasNextInt()) {
            n = sc.nextInt();
        }

        recursion(n);

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < res.size(); ++i) {
            sb.append(res.get(res.size() - i - 1));
//            System.out.println(res.get(i));
        }
        System.out.println(sb.toString());

    }


    public static void recursion(int n) {
        char flag;
        if(n > 0) {
            if(n % 2 == 0) {
                n = n / 2 - 1;
                flag = '2';
            } else {
                n = (n -1) / 2;
                flag = '1';
            }
//            System.out.println("flag: " + flag);
            res.add(flag);
        }
        if(n > 0) {
            recursion(n);
        }

    }
}
