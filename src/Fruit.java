/**
 * test
 *
 * @author nanj
 * @date 2018/8/11
 */
public class Fruit {
    private Core c;
    protected class Core {
        public Core() {
            System.out.println("Fruit.Core()");
        }
    }

    public Fruit(){
        System.out.println("New Fruit()");
        c = new Core();
    }
}
class BigFruit extends Fruit {
    public class Core{
        public Core() {
            System.out.println("BigFruit.Core()");
        }
    }
}
class Main11{
    public static void main(String[] args) {
        BigFruit f = new BigFruit();
    }

    String a = "abc";
//    String b = a.clone()
}