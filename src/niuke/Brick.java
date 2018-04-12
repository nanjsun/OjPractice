package niuke;

/**
 * test class
 *
 * @author nanj
 * @date 2018/4/12
 */

public class Brick {
        public int RectCover(int target) {
            int res = calculate(1, 2, target);
            return res;
        }

        private int calculate(int a, int b, int n) {
//            switch(n){
//                case 0:
//                    return 0;
////                    break;
//                case 1:
//                    return 1;
////                    break;
//                case 2:
//                    return 2;
////                    break;
//                default:
//                    return 2 * calculate(n - 1) + 2 * calculate(n - 2);
//
//            }

            if(n == 2) {
                return a;
            } else {
                return calculate(b, a + b, n - 1);
            }

        }
    }

