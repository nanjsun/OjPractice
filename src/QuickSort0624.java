/**
 * test
 *
 * @author nanj
 * @date 2018/6/24
 */
public class QuickSort0624 {

    public static void main(String[] args) {
        QuickSort0624 quickSort0624 = new QuickSort0624();
        int[] array = {2,21,3,5,6,67,4,9, 80,5};

        for (int i :
                array) {
            System.out.print(i + ",");
        }
        System.out.println("sorted:");

        quickSort0624.quickSort(array, 0, array.length - 1);

        for (int i :
                array) {
            System.out.print(i + ",");
        }
    }


    public void quickSort(int[] sequence, int left, int right) {
        if(right <= left) {
            return;
        }
        int splitIndex = part(sequence, left, right);

        quickSort(sequence, left, splitIndex - 1);
        quickSort(sequence, splitIndex + 1, right);
    }
    private int part(int[] sequence, int left, int right) {
        int i = left;
        int j = right;
        int target = sequence[left];

        while (true){
            while (sequence[i] <= target && i < right) {
                i ++;
            }
            while (sequence[j] >= target && j > left) {
                j --;
            }
            System.out.println(i+ "---" + j);

            if(i >= j) {
                break;
            }
            swap(sequence, i, j);
        }
        swap(sequence, left, j);

        return j;
    }
    private void swap(int[] sequence, int indexA, int indexB) {
        int temp = sequence[indexA];
        sequence[indexA] = sequence[indexB];
        sequence[indexB] = temp;
    }
}
