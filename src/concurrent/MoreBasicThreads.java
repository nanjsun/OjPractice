package concurrent;

/**
 * test class
 *
 * @author nanj
 * @date 2018/4/12
 */
public class MoreBasicThreads {
    public static void main(String[] args) {
        for(int i = 0; i < 5; ++i) {
            new Thread(new LiftOff()).start();
        }
        System.out.println("Waiting for LifOff");
    }


}
