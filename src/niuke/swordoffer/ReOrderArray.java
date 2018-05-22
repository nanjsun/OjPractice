package niuke.swordoffer;

/**
 * test
 *
 * @author nanj
 * @date 2018/5/22
 *
 *
 * 方法1思路：空间换时间， 从头开始遍历，将所有偶数放到一个单独的数列中，后面的基数把偶数的空缺填上，
 * 最后将数组偶数数组接在奇数的后面;
 *
 * 方法2思路：
 *
 *
 */
public class ReOrderArray {
    public static void main(String[] args){
        ReOrderArray reOrderArray = new ReOrderArray();
        int[] array = {1,3,2,1,5,3,5,4,23,33,13};
        print(array);
        reOrderArray.reOrderArray2(array);
        print(array);

    }



    public void reOrderArray(int[] array) {
        int[] even =  new int[array.length];
        int j = 0;
        int k = 0;
        for(int i = 0; i < array.length; ++i) {
            if(array[i] % 2 == 0) {
                even[k] = array[i];
                k ++;
            } else {
                array[j] = array[i];
                j ++;
            }
        }
        for(int i = 0; i < k; ++i) {
            array[i + j] = even[i];
        }


    }
    public void reOrderArray2(int[] array) {
        int evenIndex = 0;
        int evenCount = 0;
        for(int i = 0; i < array.length; ++i){
            if(array[i] % 2 == 0){
                evenCount ++;
            }else {
                if(evenCount == 0) {
                    evenIndex ++;
                }else {
//                    System.out.println("evenIndex: " + evenIndex);
//                    System.out.println("evenCount: " + evenCount);
//                    System.out.println("i: " + i);
                    swap(evenIndex, evenCount, array);
                    evenIndex ++;

                }
            }
        }
    }
    private void swap(int evenIndex, int evenCount, int[] array){
        int temp = array[evenCount + evenIndex];
        for(int i = evenCount; i > 0; --i) {
            array[evenIndex + i] = array[evenIndex + i -1];
        }
        array[evenIndex] = temp;

//        print(array);


    }





    public static void print(int[] array){
        System.out.println();
        for(int i : array){
            System.out.print(i + ",");
        }
        System.out.println();

    }
}
