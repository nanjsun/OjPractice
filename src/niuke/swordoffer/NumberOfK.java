package niuke.swordoffer;

import java.sql.Time;

/**
 * test
 *
 * @author nanj
 * @date 2018/9/1
 */
public class NumberOfK {
    public static void main(String[] args) {
        int[] array = {1,2,3,3,3,3,4,5};
        int k = 3;
        int res = new NumberOfK().getNumberOfK(array, k);
        System.out.println(res);
    }

    public int getNumberOfK(int[] array, int k) {
        System.out.println("startTime: " + System.currentTimeMillis());
        int res = 0;


        int startIndex = getFirstK(array,k, 0, array.length - 1);
        int endIndex = getLastK(array,k, 0, array.length - 1);


        if(startIndex < endIndex) {
            res = endIndex - startIndex + 1;
        }
        if(startIndex == endIndex && startIndex != -1){
            res = 1;
        }
        System.out.println("endTime: " + System.currentTimeMillis());
        return res;

    }


    //递归写法
    private int getFirstK(int [] array , int k, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = (start + end) >> 1;
        if(array[mid] > k){
            return getFirstK(array, k, start, mid-1);
        }else if (array[mid] < k){
            return getFirstK(array, k, mid+1, end);
        }else if(mid-1 >=0 && array[mid-1] == k){
            return getFirstK(array, k, start, mid-1);
        }else{
            return mid;
        }
    }
    //循环写法
    private int getLastK(int [] array , int k, int start, int end){
        int length = array.length;
        int mid = (start + end) >> 1;
        while(start <= end){
            if(array[mid] > k){
                end = mid-1;
            }else if(array[mid] < k){
                start = mid+1;
            }else if(mid+1 < length && array[mid+1] == k){
                start = mid+1;
            }else{
                return mid;
            }
            mid = (start + end) >> 1;
        }
        return -1;
    }

//    public int getNumberOfK(int[] array, int k) {
//        System.out.println(System.currentTimeMillis());
//        int res = 0;
//        for (int x :
//                array) {
//            if (x == k) {
//                res ++;
//            }
//            if(x > k) {
//                System.out.println(System.currentTimeMillis());
//
//                return res;
//            }
//        }
//        System.out.println(System.currentTimeMillis());
//
//        return res;
//
//    }


}
