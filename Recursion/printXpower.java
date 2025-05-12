package Recursion;
// Stack height = n
public class printXpower {
    public static void main(String[] args) {
        int ans = xPowerN(0, 3);
        System.out.println(ans);
    }

    public static int xPowerN(int x,int n){
        if(n==0){
            return 1;
        }

        if(x==0){
            return 0;
        }

        return x*xPowerN(x, n-1);

    }
}
