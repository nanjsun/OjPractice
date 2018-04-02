package leetCode;

/**
 * test class
 *
 * @author nanj
 * @date 2018/4/1
 */
public class JudgeRouteCircle {
    public static void main(String[] args) {

    }

    public boolean judgeCircle(String moves) {
        boolean res = false;
        int x = 0;
        int y = 0;

        for(int i = 0; i < moves.length(); ++i) {
            switch (moves.charAt(i)){
                case 'U':
                    x++;
                    break;
                case 'D':
                    x--;
                    break;
                case 'L':
                    y++;
                    break;
                case 'R':
                    y--;
                    break;
                default:
                    break;
            }
        }

        if(x == 0 && y ==0) {
            res = true;
        }
        return res;

    }
}
