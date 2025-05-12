package Recursion;
// stack height = log(n)
public class printXpower2 {
    public static void main(String[] args) {
        int ans = printXpower(3, 3);
        System.out.println(ans);
    }

    public static int printXpower(int x, int n){

        if(n==0) return 1;
        if(x==0) return 0;

        if(n % 2==0){
           int xPowerNby2 = printXpower(x, n/2);
           return xPowerNby2 * xPowerNby2;
        }else {
            int xPowerNby2 = printXpower(x, n/2);
            return xPowerNby2 * xPowerNby2 * x;
        }


    }
}
