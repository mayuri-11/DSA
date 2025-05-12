// Print all the subsequences of a string.
package Recursion;

public class SubSequence {
    public static void subSequence(String str, int idx,String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
    
        // to be
        subSequence(str, idx+1, newString+currChar);

        // or not to be
        subSequence(str, idx+1, newString);
    }  

    public static void main(String[] args) {
        String str = "aaa";
        subSequence(str, 0, "");
    }
}
