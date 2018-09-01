package netease;
import java.util.Scanner;

/**
 * test
 *
 * @author nanj
 * @date 2018/8/11
 */
public class SleepInClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int classLength = sc.nextInt();
        int wakeDuration = sc.nextInt();

        int[] score = new int[classLength];
        int[] isWake = new int[classLength];

        for(int i = 0; i < classLength; ++i) {
            score[i] = sc.nextInt();
        }

        for(int i = 0; i < classLength; ++ i) {
            isWake[i] = sc.nextInt();
        }

        int max = 0;


        for(int i = 0; i < classLength; ++i) {
            int addScore = 0;
            if(isWake[i] == 0) {
                for(int j = i; j < i + wakeDuration; ++ j) {
                    if(j < classLength && isWake[j] == 0) {
                        addScore += score[j];
                    }
                }
            }
            if(addScore > max) {
                max = addScore;
            }
        }
        int validScore = 0;
        for(int i = 0; i < classLength; ++i) {
            if(isWake[i] == 1) {
                validScore += score[i];
            }
        }

        System.out.println(validScore + max);
    }
}
