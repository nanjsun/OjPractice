package huawei;

import java.util.Scanner;

/**
 * test class
 *
 * @author nanj
 * @date 2018/4/10
 */
public class BigIntegerMul {

    final static int MAX =1000;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        int[] a = ToInt(str1);
        int[] b = ToInt(str2);

        int[] res = new int[a.length + b.length];

        Multiply(a, b, res);
//        System.out.print(res);
        Output(res);
    }

    private static void Output(int[] res) {
        int flag=2* MAX -1;
        while(res[flag]==0) {
            if(flag==0) {
                System.out.println("0");
                return ;
            }
            flag--;
        }
        for(int i=flag;i>=0;i--) {
            System.out.print(res[i]);
        }
        System.out.println("");
    }

    private static void Multiply(int a[],int b[],int c[]) {

        for(int i = 0; i< MAX; i++) {
            for(int j = 0; j< MAX; j++) {
                c[i+j]+=a[i]*b[j];
            }
        }
        for(int i = 0; i<2* MAX -1; i++) {
            c[i+1]+=c[i]/10;
            c[i]=c[i]%10;
        }
    }

    private static int[] ToInt(String s) {
        int len=s.length();
        int[] res = new int[MAX];

        for(int i=0;i<len;i++) {
            res[len-1-i]=s.charAt(i)-'0';
        }
        return res;
    }
}