package alibaba;

/**
 * test
 *
 * @author nanj
 * @date 2018/6/6
 */
public class KthNumber {

    public  static void main(String[] args) {
        int[] test = {7,8,6,9,4,3,2,1,5,0};
        KthNumber kthNumber = new KthNumber();
//        int trueK = 4;
        kthNumber.findKthNumber(test, 1, 0, test.length - 1);
    }

     public void findKthNumber(int[] arr, int k, int left, int right) {
        int split = part(arr, left, right);
        if(split - left == k){
            System.out.println(k + "th is: " + arr[split]);
            return;
        }

        if(split - left > k) {
            findKthNumber(arr, k, left, split - 1);
        }
        if(split - left < k) {
            findKthNumber(arr, k - (split - left + 1), split + 1, right);
        }
    }

    private int part(int[] arr, int left, int right) {
        int i = left;
        int j = right;
        int target = arr[left];
        while (true) {
            while (arr[i] <= target) {
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
        System.out.println("split info: " + j + ":" + arr[j]);
        swap(arr, j, left);
        return j;
    }
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
