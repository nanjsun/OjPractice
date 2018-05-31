package niuke.fakeTest;

import java.util.Scanner;

/**
 * test
 *
 * @author nanj
 * @date 2018/5/23
 */
public class NiuLife {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long rent = sc.nextLong();
//        System.out.println(rent);

        long fruit = sc.nextLong();
//        System.out.println(fruit);

        long money = sc.nextLong();
//        System.out.println(money);

        long fruitPrice = sc.nextLong();
//        System.out.println(fruitPrice);


        long days = dayOfLife(rent, fruit, money, fruitPrice);
        System.out.println(days);
    }


    private static long dayOfLife(long rent, long fruit, long money, long fruitPrice){
        long days = 0;
        while (money >= rent){
            if(fruit >= 1 && money >= rent){
                fruit --;
                money -= rent;
                days ++;
            } else
            if(money >= rent + fruitPrice) {
                money -= rent;
                money -= fruitPrice;
                days ++;
            } else {
                break;
            }
        }
        return days;
    }
}
