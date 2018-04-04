package huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * test class
 *
 * @author nanj
 * @date 2018/4/3
 */
public class Beibao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        while (sc.hasNext()) {
            if(sc.next() == "z") {
                break;
            }
            list.add(sc.nextInt());

        }
        int[] cost = new int[list.size() / 2];
        int[] earn = new int[list.size() / 2];
        int[] chosen = new int[list.size() / 2];
        for (int i = 0; i < list.size(); ++i) {
            if (i < list.size() / 2) {
                cost[i] = list.get(i);
                chosen[i] = 0;
            } else {
                earn[i - list.size() / 2] = list.get(i);
            }
        } // d[i][j]表示前i个物品放入容量为j的背包的最大价值  //

        int[][] d = new int[cost.length][money + 1];

//        d[i][j] = max(d[i-1][j], d[i-1][j-weights[i]] + values[i]);
        for (int i = 0; i < d.length; ++i) {
            for (int j = 1; j < money + 1; ++j) {
                if (i == 0) {
                    if (cost[i] <= j) {
                        d[i][j] = cost[i];
                    }
                } else {
                    if (j >= cost[i]) {
                        d[i][j] = Math.max(d[i - 1][j], d[i - 1][j - cost[i]] + earn[i]);
                    } else {
                        d[i][j] = d[i - 1][j];
                    }
                }
            }
         }
        int ii = cost.length - 1, jj = money;
        while (ii >= 0) {
            if (ii > 0) {
                if (jj-cost[ii] >= 0 && d[ii][jj] == d[ii - 1][jj - cost[ii]] + earn[ii]) {
                    chosen[ii] = 1;
                    jj -= cost[ii];
                }
            } else {
                if (cost[ii] <= jj) {
                    chosen[ii] = 1;
                }
            }
            ii--;
        }
        boolean first = true;
        for (int i = 0; i < chosen.length; ++i) {
            if (chosen[i] == 1) {
                if (first) {
                    System.out.print(i + 1);
                    first = false;
                } else {
                    System.out.print(" " + (i + 1));
                }
            }
        }
    }
}
