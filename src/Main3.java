import java.util.Scanner;

/**
 * test class
 *
 * @author nanj
 * @date 2018/3/27
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = new String();
        if(sc.hasNext()){
            input = sc.next();
        }
        int length = input.length();
        int[] counts = new int[length];
        float currentCount = 1;
        int countIndex = 0;
        char[] inputArray = input.toCharArray();

        for(int i = 1; i< length; ++i) {
            if(inputArray[i] != inputArray[i -1]){
                currentCount ++;
            }
        }


        float result = length / currentCount;


        System.out.println(length);
        System.out.println(currentCount);
        System.out.printf("%.2f", result);
    }
}
