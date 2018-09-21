package niuke.swordoffer;

/**
 * test
 *
 * @author nanj
 * @date 2018/9/20
 */
public class Multiply {
    public int[] multiply(int[] A) {
        if (A == null || A.length == 0) {
            return null;
        }
        int[] res = new int[A.length];

        for(int i = 0; i < A.length; ++i) {
            res[i] = 1;
            for(int j = 0; j < A.length; ++j) {
                if(j != i) {
                    res[i] = res[i] * A[j];
                }
            }
        }

        return res;

    }
    public int[] multiplyB(int[] A) {
        int length = A.length;
        int[] B = new int[length];
        if(length != 0) {
            B[0] = A[0];
            for(int i = 1; i < length; ++i) {
                B[i] = B[i - 1] * A[i -1];
            }

            int temp = 1;
            for (int j =length - 2; j >= 0; j--) {
                temp *= A[j + 1];
                B[j] *= temp;
            }
        }
        return B;
    }
}
