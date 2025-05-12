package BackTracking;
// Print all Permutation of Given String.
public class Permutation {
    public static void main(String[] args) {
        String str = "ABC";
        printPermutation(str, 0, "");
    }

    public static void printPermutation(String str, int idx, String ptr){
        if(str.length() == 0){
            System.out.println(ptr);
            return;
        }
        for(int i=0; i<str.length();i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i)+ str.substring(i+1);
            printPermutation(newStr, idx+1, ptr+currChar);
        }
    }
}
