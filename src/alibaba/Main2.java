package alibaba;

import java.util.Scanner;

/**
 * test
 *
 * @author nanj
 * @date 2018/5/11
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groupCount = scanner.nextInt();
        int ruleCount = scanner.nextInt();
        System.out.println(ruleCount);
        int[][] rules = new int[ruleCount][2];
        String in;
        in = scanner.nextLine();


        for(int i = 0; i < ruleCount; ++i) {
            in = scanner.nextLine();
            String[] ss = in.split(",");
            System.out.println("leng:" + ss.length);
            rules[i][0] = Integer.valueOf(ss[0]);
            rules[i][1] = Integer.valueOf(ss[1]);
            if(rules[i][1] - rules[i][0] == 1 && rules[i][0] % 2 == 1){
                System.out.println("no");
                return;
            }
        }



        System.out.println("yes");
    }
}
