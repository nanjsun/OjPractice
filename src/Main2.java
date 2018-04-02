import java.util.Scanner;

/**
 * test class
 *
 * @author nanj
 * @date 2018/3/27
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        if(sc.hasNextInt()) {
            input = sc.nextInt();
        }

        int inputLength = (input + "").length();
        char[] inputArray = (input + "").toCharArray();
        char[] reverseArray = new char[inputLength];
        for(int i = 0; i < inputLength; ++i) {
            reverseArray[i] = inputArray[inputLength - i -1];
        }

        int reverseInt = Integer.valueOf(new String(reverseArray));

        int res = input + reverseInt;
        System.out.println(input);
        System.out.println(reverseInt);
        System.out.println(res);
    }
}
