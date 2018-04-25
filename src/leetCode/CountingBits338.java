package leetCode;

/**
 * test
 *
 * @author nanj
 * @date 2018/4/25
 */
public class CountingBits338 {


    public static void main(String[] args) {
        CountingBits338 countingBits338 = new CountingBits338();
        int[] res1 = countingBits338.countBits(5);
        for(int i : res1) {
            System.out.println(i);
        }
    }

    int[] res;


    public int[] countBits(int num) {
        res = new int[num + 1];
        for(int i = 0; i < res.length; ++i){
            res[i] = -1;
        }

        for (int i = 0; i <= num; ++i) {
            res[i] = count(i);
        }

        return res;
    }

    private int count(int num) {
//        System.out.println("count: " + num);
        if(num == 0) {
            return 0;
        }
        if(res[num] != -1) {
            return res[num];
        }
        if(num % 2 !=0) {
            return res[num - 1] + 1;
        } else {
            return res[num /2];
        }
    }
}
