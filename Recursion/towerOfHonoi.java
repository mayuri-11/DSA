package Recursion;

// RULES
// only one disk transfered in 1 step
// Smaller disks are always kept on top of larger disks

public class towerOfHonoi {
    public static void main(String[] args) {
        int n = 2;
        TowerOfHonai(n, "Src", "Helper", "Dest");
        
    }

    public static void  TowerOfHonai(int n, String src,String helper,String dest){
        if(n==1){
            System.out.println("Move disk 1 from "+src+" to "+dest);
            return;
        }

        TowerOfHonai(n-1, src, dest, helper);
        System.out.println("transfer disk " + n + " from " + src + " to "+ dest);
        TowerOfHonai(n-1,helper,src,dest);
    }
}
