//package BasicsOfJava;
import java.util.*;
public class arrays {
    public static void main(String[] args) {
        createArray(4);
    }

    public static void createArray(int n){
        int myArray[] = new int[n];

        for(int i= 0; i<n; i++){
            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter element " + (i+1) + ": ");
            myArray[i] = sc.nextInt();
        }

        for(int j = 0; j<n; j++){
            System.out.println((j+1) + " := " + (myArray[j]));
        }
    }
}
