package Recursion;

public class printFibbonaci {
    public static void main(String[] args) {
        int n = 4;
        int ans = printFibb(n);
        System.out.println((n+2)+ "th element in fibbonacci series is: " + ans);
    }

    public static int printFibb(int n){
        if (n==1 || n==0) {
            return 1;
        }
        
        int fibOfn = printFibb(n-1) +printFibb(n-2);
    
        return fibOfn;
    }
}
