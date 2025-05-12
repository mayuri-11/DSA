//package BasicsOfJava;
import java.util.*;
public class functions {
    public static void main(String[] args) {
        int sum = calculateSum(12, 12);
        System.out.println("Sum is: " + sum);

        System.out.println("Enter your name: ");
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        printMyName(name);
    }

    public static int calculateSum(int a, int b){
        return a + b;
    }

    public static void printMyName(String name){
        System.out.println("My name is: " + name);
        return;
    }
}
