package Stack;
import java.util.*;
public class PreToPost {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        Stack<String> st = new Stack<>();

        for(int i = str.length()-1; i>=0; i--){
            char ch = str.charAt(i);
            int ascii = (int) ch;

            if(ascii >= 48 && ascii<=57){
                st.push(ch+"");
            }else{
                String b = st.pop();
                String a = st.pop();

                st.push(a+b+ch);
            }
            
        }
        System.out.println(st.peek());
    }
}
