package meituan;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * test
 *
 * @author nanj
 * @date 2018/9/6
 */
public class ArrayRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int t = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; ++i) {
            array[i] = sc.nextInt();
        }
        int res = new ArrayRange().findMax(n, k, t, array);
        System.out.println(res);
    }

    public int findMax(int n, int k, int t, int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int j = 0; j < k; ++j) {
            if (map.containsKey(array[j])) {
                map.replace(array[j], map.get(array[j]) + 1);
            } else {
                map.put(array[j], 1);
            }
        }
        for (Map.Entry<Integer, Integer> x : map.entrySet()
                ) {
            if (x.getValue() >= t){
                res ++;
                    break;
            }
        }
        for (int i = 1; i < n - k + 1; ++i) {
            map.replace(array[i - 1], map.get(array[i - 1]) - 1);
            if(map.containsKey(array[i + k - 1])) {
                map.replace(array[i + k - 1], map.get(array[i + k - 1]) + 1);
            } else {
                map.put(array[i + k - 1], 1);
            }
            for (Map.Entry<Integer, Integer> x : map.entrySet()
                    ) {
                if (x.getValue() >= t){
                    res ++;
                    break;
                }
            }
        }
        return res;
    }
}
