
// push element at bottom using recursion in stack

package Stack;
import java.util.Stack;

public class Temp {

    public static void insertAtBottom(Stack<Integer> st, int ele){
        if(st.size() == 0){
            st.push(ele);
            return;
        }
        int x = st.pop();
        insertAtBottom(st, ele);
        st.push(x);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        insertAtBottom(st,34);
        System.out.println(st);


    }
}
