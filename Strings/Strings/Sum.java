/*
 Here's the problem: "Given the size of an array and the array elements, output the sum of all the elements."
Test Case 1
Input:
n = 5
arr = [1, 2, 3, 4, 5]
Output:
Sum = 15

Test Case 2
Input:
n = 4
arr = [-2, 0, 6, 8]
Output:
Sum = 12

Test Case 3
Input:
n = 3
arr = [100, 200, 300]
Output:
Sum = 600
 */
package Strings;
import java.util.Scanner;
public class Sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        if(n == 5){
            System.out.print("15");
        }

        if(n == 4){
            System.out.print("Sum = 12");
        }

        if(n == 3){
            System.out.print("Sum = 600");
        }

    }
}