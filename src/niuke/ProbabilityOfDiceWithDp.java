package niuke;

class Main {
    private static int MAX=6;
    public static void main(String[] args) {
        int n=2;
        printProbabilityOfDice2(n);//solution 2,use DP
    }

    public static void printProbabilityOfDice2(int n){
        if(n<1){
            return;
        }
        double total=Math.pow(MAX, n);
        int maxSum=n*MAX;
        double[][] f=new double[n+1][n*MAX+1];
        for(int i=1;i<=MAX;i++){
            f[1][i]=1;
        }
        for(int k=2;k<=n;k++){
            for(int sum=n;sum<=maxSum;sum++){
                for(int i=1;sum-i>=1&&i<=MAX;i++){
                    f[k][sum]+=f[k-1][sum-i];
                }
            }
        }
        System.out.print("[");
        for(int sum=n;sum<=maxSum;sum++){
            double p = f[n][sum] / total;
            System.out.print("[" + (sum) + ", ");

            System.out.printf("%.5f",p);

            System.out.print("]");
            if(sum < maxSum) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}

