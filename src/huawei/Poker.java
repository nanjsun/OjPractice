package huawei;

import javax.swing.plaf.PanelUI;
import java.util.Scanner;

/**
 * test class
 *
 * @author nanj
 * @date 2018/3/30
 */
public class Poker {
    private static String[] pai = new String[2];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        pai = input.split("-");
        int result = 0;
        int paiAType = pai[0].split(" ").length;
        int paiBTpye = pai[1].split(" ").length;

        if(paiAType == paiBTpye){
            if(pai[0].length() > pai[1].length()) {

            }


        }

    }

    public void compare() {

    }
}
