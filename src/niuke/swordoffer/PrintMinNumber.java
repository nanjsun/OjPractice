package niuke.swordoffer;

/**
 * test
 *
 * @author nanj
 * @date 2018/8/25
 */
public class PrintMinNumber {
    public String PrintMinNumber(int[] numbers) {
        int length = numbers.length;
        if (length == 0) {
            return new String();
        }
        String[] numberString = convertString(numbers);
        numberString[0] = String.valueOf(numbers[0]);
        for (int i = 1; i < length; ++i) {
            for (int j = 0; j < i; ++j) {
                String sorted = numberString[j];
                String target = String.valueOf(numbers[i]);

                long targetSort = Long.valueOf(target + sorted);
                long sortTarget = Long.valueOf(sorted + target);
                if (targetSort <= sortTarget) {
                    for (int k = i - 1; k > j - 1; --k) {
                        numberString[k + 1] = numberString[k];
                    }
                    numberString[j] = String.valueOf(numbers[i]);
                    break;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String x :
                numberString) {
            sb.append(x);
        }
        String res = sb.toString();
        System.out.println(res);
        return res;
    }

    public String[] convertString(int[] numbers) {
        String[] res = new String[numbers.length];
        for (int i = 0; i < numbers.length; ++i) {
            res[i] = String.valueOf(numbers[i]);
        }
        return res;
    }

    public static void main(String[] args) {

        int[] numbers = {3, 32, 321};
        PrintMinNumber printMinNumber = new PrintMinNumber();
        printMinNumber.PrintMinNumber(numbers);
    }
}
