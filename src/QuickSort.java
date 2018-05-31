/**
 * @author nanj2
 */
public class QuickSort {

    private int[] arr;

    public QuickSort(int[] arr){
        this.arr = arr;
    }

    public void sort(int begin, int end) {
//        System.out.println("xxx");
        if(begin >= end) {
            return;
        }
        int target = part(begin, begin, end);
//        System.out.println("target:" + target + "-target value:" + arr[target]);

        sort(begin, target - 1);
        sort(target + 1, end);
    }
    private int part(int target, int left, int right) {
        int i = left;
        int j = right;
        while (true) {
            while (arr[j] >= arr[target]) {
                j --;
                if(j == left) {
                    break;
                }
            }
            System.out.println("left  :" + left +   "-left   value:" + arr[left]);
            System.out.println("target:" + target + "-target value:" + arr[target]);
            System.out.println("right :" + right +  "-right  value:" + arr[right]);
            while (arr[i] <= arr[target]){
                i ++;
                if(i == right) {
                    break;
                }
            }
            if(i >= j) {
                break;
            }
            swap(i, j);
        }
        swap(left, j);
        return j;
    }

    public int[] getArr() {
        return arr;
    }

    private void swap(int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] xx = {4,6,4,5,23,3,4,2,33,2,67,35,1,3,5,62,2,3};
        QuickSort qs = new QuickSort(xx);

        qs.sort(0,xx.length -1);
        int[] res = qs.getArr();
        for (int i: xx) {
            System.out.print(i + ",");
        }
        System.out.println("res---");

        for (int i: res) {
            System.out.print(i + ",");
        }
    }
}
