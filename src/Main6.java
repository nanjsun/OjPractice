import java.util.Scanner;

/**
 * test class
 *
 * @author nanj
 * @date 2018/3/27
 */
public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int res = 0;


        if(sc.hasNextInt()){
            n = sc.nextInt();
        }

        int[][] rec = new int[n][4];

        for(int i = 0; i < 4; ++i) {
            for(int j = 0; j < n; ++j) {
                rec[j][i] = sc.nextInt();
            }
        }

        res = n;

        System.out.println(res);

        }



}
