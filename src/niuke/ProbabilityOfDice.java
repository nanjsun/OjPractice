package niuke;

import java.util.Scanner;

public class ProbabilityOfDice {

    private static int MAX = 6;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        printProbabilityOfDice(n);
    }

    public static void printProbabilityOfDice(int n) {
        if (n < 1) {
            return;
        }
        double total = Math.pow(MAX, n);
        int len = n * MAX - n * 1 + 1;
        int[] times = new int[len];
        for (int i = 1; i <= MAX; i++) {
            probabilityOfDice(n, i, n, 0, times);
        }
        System.out.print("[");
        for (int i = 0; i < len; i++) {
            double p = times[i] / total;
            System.out.print("[" + (i + n) + ", ");

            System.out.printf("%.5f",p);

            System.out.print("]");
            if(i < len -1) {
                System.out.print(", ");
            }

        }
        System.out.print("]");


    }

    public static void probabilityOfDice(int n, int curDiceValue, int numOfDices, int curSum, int[] times) {
        if (numOfDices == 1) {
            int sum = curSum + curDiceValue;
            times[sum - n]++;
        } else {
            int sum = curSum + curDiceValue;
            for (int i = 1; i <= MAX; i++) {
                probabilityOfDice(n, i, numOfDices - 1, sum, times);
            }
        }
    }
}