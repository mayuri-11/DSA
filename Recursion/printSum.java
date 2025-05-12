package Recursion;

public class printSum {
    public static void main(String[] args) {
        numSum(1,4,0);
    }

    public static void numSum(int i,int n,int sum){
        
        if(i == n){
            sum += n;
            System.out.println(sum);
            return;
        }
        sum += i;
        numSum(i+1,n,sum);

    }
}
