/**
 * test class
 *
 * @author nanj
 * @date 2018/3/28
 */
public class Fiber {
    public static void main(String[] args) {
        Fiber fiber = new Fiber();
        int res = fiber.fiber(5);
        System.out.println(res);
    }

    private int fiber(int x) {

        if(x == 1 || x == 2) {
            return 1;
        }
        return fiber(x - 2) + fiber(x -1);
    }
}
