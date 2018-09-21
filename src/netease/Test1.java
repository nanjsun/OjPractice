package netease;

/**
 * test
 *
 * @author nanj
 * @date 2018/9/11
 */
public class Test1 {
    public static void main(String[] args) {
        Thread t = new Thread();
        try {
//            t.sleep(10);
            Thread.sleep(100);
            t.wait();
        } catch (Exception e) {
            e.printStackTrace();
        }
        t.start();
    }
}


