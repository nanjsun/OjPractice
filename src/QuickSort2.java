/**
 * @author
 */
public class QuickSort2{


    public static void main(String[] args) {
    //     int[] test1 = {12,23,1,3,1231,23,12,3,12,21,32,12,312,312};
         int[] test2 = {7,8,6,9,4,3,2,1,5,0};
         QuickSort2 quickSort2 = new QuickSort2();
         printArr(test2);
         quickSort2.quickSort(test2, 0, test2.length -1);
        printArr(test2);
    }

    public void quickSort(int[] arr, int left, int right) {
        if(left >= right) {
            return;
        }
        int split = part(arr, left, right);

        quickSort(arr, left, split - 1);
        quickSort(arr, split + 1, right);

}
    private int part(int[] arr, int left, int right){
        int i = left;
        int j = right;
        int target = arr[left];
        while (true) {
            while(arr[i] <= target) {
                i ++;
                if(i >= right) {
                    break;
                }
            }
            while (arr[j] >= target) {
                j --;
                if(j <= left) {
                    break;
                }
            }
            if(i >= j) {
                break;
            }
            swap(arr, i, j);
        }
        swap(arr, j, left);
        return j;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void printArr(int[] arr) {

        System.out.print("{");
        int sum = 0;
        for (int x: arr) {

            System.out.print(x + ", ");
            sum += x;
        }
        System.out.print("}");
        System.out.println("sum: " + sum);
        System.out.println();

    }
}