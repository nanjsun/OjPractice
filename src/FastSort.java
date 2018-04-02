/**
 * test class
 *
 * @author nanj
 * @date 2018/4/1
 */
public class FastSort {

    public static void main(String[] args) {
        Integer[] randomInteger = getRandonInt(1000000);

        System.out.println("before sort:" + randomInteger.toString());
        for(int x : randomInteger) {
            System.out.print(x + ",");
        }
        long beginTime = System.currentTimeMillis();
        sort(randomInteger,0, randomInteger.length - 1);
        long endTime = System.currentTimeMillis();

        long duration = endTime - beginTime;
        System.out.println("");
        System.out.println("after sort:" + randomInteger.toString());
        for(int x : randomInteger) {
            System.out.print(x + ",");
        }

        System.out.println("");
        System.out.println("beginTime:" + beginTime);
        System.out.println("endTime:" + endTime);
        System.out.println("duration:" + duration);


    }

    private static Integer[] getRandonInt(int length){
        Integer[] res = new Integer[length];
        for (int i = 0; i < length; ++i) {
            res[i] = (int)Math.round(Math.random() * length);
        }
        return res;
    }

    public static void sort(Comparable[] a) {
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if(hi <= lo) {
            return;
        }

        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }
    private static int partition(Comparable[] a, int lo, int hi) {
        int i = lo, j = hi + 1;

//        split array with a[10]
        Comparable v = a[lo];

        while (true) {
            while (less(a[++i], v)){
                if(i == hi) {
                    break;
                }
            }
            while (less(v, a[--j])){
                if(j == lo) {
                    break;
                }
            }
            if(i >= j) {
                break;
            }
            exch(a, i, j);
        }

        exch(a, lo, j);
        return j;
    }

    private static boolean less(Comparable a, Comparable b){
        if(a.compareTo(b) < 0) {
            return true;

        } else {
            return false;
        }
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable temp = null;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
