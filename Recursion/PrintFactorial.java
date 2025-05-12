package Recursion;

public class PrintFactorial {
    public static void main(String[] args) {
        int ans = printFactorial(6);
        System.out.println(ans);
    }

    public static int printFactorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fact_nm1 = printFactorial(n-1);
        int fact_n = fact_nm1 * n;
        return fact_n;
    }
}
