package niuke.swordoffer;

/**
 * test
 *
 * @author nanj
 * @date 2018/5/15
 *
 *
 * 地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，
 * 但是不能进入行坐标和列坐标的数位之和大于k的格子。
 * 例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。
 * 但是，它不能进入方格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
 *
 *
 * 采用回溯法计算每个点是否可以可达
 *
 * 注意，在对sum 操作的时候，注意 每个方法传入的是变量的副本，方法运行结束前，不对原变量操作
 *
 * 基本类型作为参数传递时，是传递值的拷贝，无论你怎么改变这个拷贝，原值是不会改变的 ————>值传递
 * 在Java中对象作为参数传递时，是把对象在内存中的地址拷贝了一份传给了参数     ———————>引用传递
 *
 */
public class RobotRange13 {
    public static void main(String[] args) {
        RobotRange13 robotRange13 = new RobotRange13();
//        boolean res = robotRange13.check(5, 10,10);
//        System.out.println(res);
        int res1 = robotRange13.movingCount(5,10,10);
        System.out.println(res1);

    }
//    private int rows;
//    private int cols;
    private int counts;


    public int movingCount(int threshold, int rows, int cols) {
//        this.rows = rows;
//        this.cols = cols;
        int sum = 0;
        boolean[][] checked = new boolean[rows][cols];

        checkCore(sum, checked, threshold, 0, 0, rows, cols);
        return counts;
    }

    private void checkCore(int sum, boolean[][] checked, int threshold, int row, int col, int rows, int cols) {
        if(row < 0 || row >= rows || col < 0 || col >= cols || checked[row][col]) {
//            System.out.println("out of range or checked");
//            System.out.println("row:" + row);
//            System.out.println("col:" + col);
            return;
        }
        if(check(threshold, row, col)){
            counts ++;
            System.out.println("row: " + row + "-col: " + col + "->" + counts);

            checked[row][col] = true;
            checkCore(sum, checked, threshold, row + 1, col, rows, cols);
            checkCore(sum, checked, threshold, row - 1, col, rows, cols);
            checkCore(sum, checked, threshold, row, col + 1, rows, cols);
            checkCore(sum, checked, threshold, row, col - 1, rows, cols);
        }

    }

    private boolean check(int threshold, int row, int col) {
        boolean res = true;
        for (int i = 10; i >= 0; i --) {
            threshold = threshold - (int)(row / Math.pow(10, i)) - (int)(col / Math.pow(10, i));
            row = row % (int)Math.pow(10, i);
            col = col % (int)Math.pow(10, i);
            if(threshold < 0) {
                res = false;
                break;
            }
        }
        return res;
    }
}
