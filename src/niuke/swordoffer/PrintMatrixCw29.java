package niuke.swordoffer;

import java.util.ArrayList;

/**
 * test
 *
 * @author nanj
 * @date 2018/6/13
 */
public class PrintMatrixCw29 {
    public static void main(String[] args) {
//        int[][] matrix = {{1,2,3,4,17},{5,6,7,8,18},{9,10,11,12,19},{13,14,15,16,20},{25,24,23,22,21}};
        int[][] matrix = {{1},{2},{3},{4},{5}};

        ArrayList<Integer> res = new PrintMatrixCw29().printMatrix(matrix);
        for (int i :
                res) {
            System.out.print(i + ",");

        }

    }
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        int startX = 0;
        int startY = 0;
        int sizeX = matrix[0].length;
        int sizeY = matrix.length;
        int[] scope = {startX, startY, sizeX, sizeY};
        ArrayList<Integer> res = new ArrayList<>();

        print(matrix, scope, res);


        return res;

    }
    private void print(int[][] matrix, int[] scope, ArrayList<Integer> res) {
//        int i = scope[0];

        while (true){
            System.out.println("<-------->");
            System.out.println(scope[0]);
            System.out.println(scope[1]);
            System.out.println(scope[2]);
            System.out.println(scope[3]);
            System.out.println("<-------->");

            //            left -> right
            if(scope[2] <= 0 || scope[3] <= 0) {
                return;
            }
            for(int i = 0; i < scope[2]; ++i) {
                res.add(matrix[scope[1]][i + scope[0]]);
            }

            //            top -> bottom
            if(scope[2] <= 0 || scope[3] <= 0) {
                return;
            }
            for(int i = 1; i < scope[3]; ++i) {
                res.add(matrix[i + scope[1]][scope[0] + scope[2] - 1]);
            }

            //            right -> left
            if(scope[2] <= 0 || scope[3] <= 1) {
                return;
            }
            System.out.println("right -> left");
            for(int i = 1; i < scope[2]; ++i) {
                res.add(matrix[scope[1] + scope[3] - 1] [scope[1] + scope[2] -i - 1]);
                System.out.println(matrix[scope[1] + scope[3] - 1] [scope[2] - 1 -i]);

            }

            //            bottom -> top
            if(scope[2] <= 1 || scope[3] <= 1) {
                return;
            }
            System.out.println("bottom -> top");

            for(int i = 1; i < scope[3] - 1; ++i) {
                res.add(matrix [scope[1] + scope[3] - 1 - i][scope[0]]);
                System.out.println(matrix [scope[3] - 1 - i][scope[0]]);


            }
            scope[0] += 1;
            scope[1] += 1;
            scope[2] -= 2;
            scope[3] -= 2;

        }

    }
}
