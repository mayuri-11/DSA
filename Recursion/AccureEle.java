package Recursion;

public class AccureEle {

    public static int first = -1;
    public static int last = -1;

    public static void main(String[] args) {
        accureEle( 'a', "abdchaaabhc", 0);
        System.out.println(first + " " + last);
    }

    public static void accureEle(char ele, String str, int idx){
        if(idx == str.length()) return;
        if(str.charAt(idx) == ele){
            
            if(first == -1){
                first = idx;
            }

            last = idx;
        }

        accureEle(ele, str, idx+1);
        return;
    }
}
