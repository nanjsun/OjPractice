package niuke;

import java.util.Scanner;

/**
 * test class
 *
 * @author nanj
 * @date 2018/4/9
 */

public class Brackets {
    public static String solve(String string){
        int ls=string.length();
        int ans=0;
        int left=0;
        int right=0;
        for(int i=0;i<ls;i++)
        {
            if(string.charAt(i)=='('){
                left+=1;
            }
            if(string.charAt(i)==')') {
                right+=1;
            }
            ans=Math.max(ans, right-left);
            System.out.println("ans:" + ans);

        }
        if(string==")("){
            return "Yes";
        }
        if(left==right&&ans<=1&&left>=2){
            System.out.println("ans:" + ans);
            return "Yes";

        }

        return "No";
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        for(int i=0;i<t;i++)
        {
            String string=scanner.next();
            System.out.println(solve(string));
        }
    }

}
