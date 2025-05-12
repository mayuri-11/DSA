//package BasicsOfJava;
import java.util.*;
public class ToDarrays {
    public static void main(String[] args) {
       int twoDArray[][] = new int[2][3];
       int findNum = 12;

       // Take 2D array as input from the user
       for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                @SuppressWarnings("resource")
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter Element " + i + " " +j+ ": ");
                twoDArray[i][j] = sc.nextInt();
            }
        }

        // Print 2D array
        for(int i =0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }

        // Find Given element in 2D array
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                if(twoDArray[i][j] == findNum){
                    System.out.println("Element found at position " + i + " " + j);
                }
            }
        }
    }

    


}
