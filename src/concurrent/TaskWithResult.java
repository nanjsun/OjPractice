package concurrent;

import java.util.concurrent.Callable;

/**
 * test class
 *
 * @author nanj
 * @date 2018/4/13
 */
public class TaskWithResult implements Callable<String> {
    private int id;
    public TaskWithResult(int id) {
        this.id = id;
    }

    @Override
    public String call() {
        return "result of TaskWithResult" + id;
    }
}
