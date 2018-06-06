package alibaba;

import com.sun.istack.internal.NotNull;

/**
 * test
 *
 * @author nanj
 * @date 2018/5/28
 */
public class MidNumber {
    public static void main(String[] args) {
        MidNumber midNumber = new MidNumber();
        int[] test = {1,2,3,4,5,6};
        int[] test1 = {1,2,1,1,11,12,3,2,3,1,21,41,3};
        int[] test2 = {55,4,232,1,2,5,6,23,4,3,2,234,5,62,2,3,4};
//        int res = midNumber.findMidNumber(test1);

        int res = 0;
        System.out.println("array before sort:");
        midNumber.printArray(test1);
        midNumber.quickSort(test1, 0, test1.length - 1);
        System.out.println("array after sort:");
        midNumber.printArray(test1);
//        System.out.println(res);

    }

    public int findMidNumber(int[] nums) {
        System.out.println("origin:");
        for (int i :
                nums) {
            System.out.print(i + ", ");
        }
        System.out.println();
        quickSort(nums, 0, nums.length - 1);
        System.out.println("sorted:");
        for (int i :
                nums) {
            System.out.print(i + ", ");
        }
        System.out.println();
        return nums[nums.length / 2];
    }

    private void quickSort(int[] numbers, int indexStart, int indexEnd) {
        if(indexStart >= indexEnd){
            return;
        }
        int splitPoint = part(numbers, indexStart, indexEnd);
//        printArray(numbers);
        quickSort(numbers, indexStart, splitPoint - 1);
        quickSort(numbers, splitPoint + 1, indexEnd);
    }

    private int part(int[] numbers, int indexStart, int indexEnd) {

        int i = indexStart;
        int j = indexEnd;
        int point = numbers[indexStart];
        while (true){
            while (numbers[i] <= point) {
                i ++;
                if(i == indexEnd) {
                    break;
                }
            }
            while (numbers[j] >= point){
                j --;
                if(j == indexStart) {
                    break;
                }
            }
            if(j <= i) {
                System.out.println("break value- i: " + i + " j: " + j);
                break;
            } else {
                System.out.println("i:" + i + " value:" + numbers[i]);
                System.out.println("j:" + j + " value:" + numbers[j]);
                swap(i, j, numbers);
                printArray(numbers);
            }
        }
        swap(j, indexStart, numbers);
        System.out.println("array after one part");
        printArray(numbers);
        return j;

    }
    private void swap(int i, int j, int[] numbers){
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
    private void printArray(int[] numbers) {
        System.out.print("{");
        for(int x : numbers) {
            System.out.print(x + ", ");
        }
        System.out.println("}");
    }



}
