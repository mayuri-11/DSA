//package BasicsOfJava;
import java.util.Scanner;

//  * * * * * 
//   * * * * 
//    * * * 
//     * * 
//      * 
public class pattern {
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            
            for(int i=1; i<=n; i++){
                for(int k=1;k<=i;k++){
                    System.out.print(" ");
                }
                for(int j=1; j<=n-i+1; j++){
                    System.out.print("* ");
                }
                
                System.out.println();
            }
            sc.close();
        }
    
}

// ********
// **    **
// * *  * *
// *  **  *
// *  **  *
// * *  * *
// **    **
// ********

// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     for(int row =1;row<=n; row++ ){
//         for(int column=1;column<=n;column++){
//             if(row == 1||column==1|| row == n||column==n ||row==column ||row+column == n+1){
//                 System.out.print("*");
//             }else{
//                 System.out.print(" ");
//             }
//         }
//         System.out.println();
//     }
// }
