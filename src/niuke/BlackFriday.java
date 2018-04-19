package niuke;

import java.util.Scanner;

public class BlackFriday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt() + 1900;
        int weeks = sc.nextInt();
        int res = calc(year, weeks);

        System.out.println(res);
    }

    private static int calc(int year, int weeks) {
        int res = 0;

        int firstDay = firstDay(year);

        if(!isRun(year)){

        }

        int week = (weeks + 7 - firstDay) % 7;
        switch(week){
            case 0 :
                res = 1;
                break;

            case 1:
                res = 3;
                break;

            case 2:
                res = 1;
                break;

            case 3:
                res = 2;
                break;

            case 4:
                res = 2;
                break;

                case 5:
                res = 2;
                break;
                case 6:
                res = 2;
                break;

                default:
                    break;
        }





        return  res;
    }

    private static int firstDay(int year){
        int firstDay = 0;

        int sumDay = 0;
        for(int i = 0; i < year - 1900; ++i) {
            if (isRun(i + 1900)){
                sumDay += 366;
            } else {
                sumDay += 365;
            }
        }

        firstDay = sumDay % 7 + 1;

        firstDay = firstDay & 7;

//        System.out.println("firstDay" + firstDay);

        return firstDay;
    }

    private static boolean isRun(int year) {
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }else {
            return false;
        }
    }

}
