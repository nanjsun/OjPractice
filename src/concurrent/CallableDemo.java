package concurrent;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * test class
 *
 * @author nanj
 * @date 2018/4/13
 */
public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        ArrayList<Future<String>> results =
                new ArrayList<>();
        for(int i = 0; i < 10; ++i) {
            results.add(exec.submit(new TaskWithResult(i)));
        }
        for(Future<String> fs :results){
            try {
                System.out.println(fs.get());
            } catch (InterruptedException e) {
                System.out.print(e);
                return;
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                exec.shutdown();            }
        }
    }
}
