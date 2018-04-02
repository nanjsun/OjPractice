import java.util.Scanner;

/**
 * test class
 *
 * @author nanj
 * @date 2018/3/27
 */
public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 0;
        int M = 0;

        if(sc.hasNextInt()){
            N = sc.nextInt();
        }
        if(sc.hasNextInt()){
            M = sc.nextInt();
        }
        int[][] works = new int[N][2];
        int[][] friends = new int[M][2];
        for(int i = 0; i < N; ++i) {
            works[i][0] = sc.nextInt();
            works[i][1] = sc.nextInt();
        }

        for(int i = 0; i < M; ++i) {
            friends[i][0] = sc.nextInt();
        }


//        System.out.println("N:" + N);
//        System.out.println("M:" + M);
//        int[][] sortedWorks = new int[N][2];
//        int index = 0;
        int temp =0;
        for(int i = N - 1; i > 0; --i) {
            for(int j = 0; j < i; ++j){
                if(works[j + 1][1] < works[j][1]) {
                    temp = works[j + 1][1];
                    works[j + 1][1] = works[j][1];
                    works[j][1] = temp;
                    temp = works[j + 1][0];
                    works[j + 1][0] = works[j][0];
                    works[j][0] = temp;
                }
            }

        }

        for(int i = 0; i < M; ++i) {
            for(int j = 0; j < N; ++j) {
                if(friends[i][0] >= works[j][0]) {
                    friends[i][1] = works[j][1];
                }
            }
        }

        for(int i = 0; i < M; ++i) {
            System.out.println(friends[i][1]);
        }








    }


}
