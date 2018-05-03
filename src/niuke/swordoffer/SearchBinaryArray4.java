package niuke.swordoffer;

/**
 * test
 *
 * @author nanj
 * @date 2018/4/28
 */
public class SearchBinaryArray4 {
    public static void main(String[] args) {
        SearchBinaryArray4 searchBinaryArray4 = new SearchBinaryArray4();

        int[][] array = {{1,4,6,11},{2,5,7,15}, {4,6,8,17}, {5,8,10, 19}};
        int target = 10;
        boolean res = searchBinaryArray4.Find(target, array);
        System.out.println(res);
    }



    public boolean Find(int target, int [][] array) {
        boolean find = false;
        if(array.length > 0) {
            int rows = array.length;
            int cols = array[0].length;

            int row = 0;
            int col = cols - 1;
            while (row < rows && col < cols && col >= 0) {
                if(array[row][col] == target) {
                    find = true;
                    break;
                } else if (array[row][col] > target) {
                    col --;
                }else {
                    row ++;
                }
            }
        }
        return find;
    }

}
