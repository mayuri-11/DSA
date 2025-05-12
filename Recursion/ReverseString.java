package Recursion;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello";
        int index = str.length()-1;
        reverseString(str,index);
    }

    public static void reverseString(String str, int index){
        if(index == -1){
            return;
        }
        
        System.out.print(str.charAt(index));
        reverseString(str, index-1);
       
    }
}
