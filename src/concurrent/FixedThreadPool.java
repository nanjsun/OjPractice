package concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * test class
 *
 * @author nanj
 * @date 2018/4/12
 */
public class FixedThreadPool {
    public static void main(String[] args){
        ExecutorService exec = Executors.newFixedThreadPool(5);
        for(int i = 0; i < 5; ++i) {
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }




}
