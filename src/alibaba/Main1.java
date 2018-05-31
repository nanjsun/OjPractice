package alibaba;

import java.util.Scanner;

/**
 * test
 *
 * @author nanj
 * @date 2018/5/11
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int beginX = scanner.nextInt();
        int beginY = scanner.nextInt();
        String beginDirection = scanner.next();

        int endX = scanner.nextInt();
        int endY = scanner.nextInt();
        String endDirection = scanner.next();

        int r = scanner.nextInt();
        int c = scanner.nextInt();
        int[][] map = new int[r][c];



        for(int i = 0; i < r; i ++) {
            for(int j = 0; j < c; j ++) {
                map[i][j] = scanner.nextInt();
            }

        }
    }
}
