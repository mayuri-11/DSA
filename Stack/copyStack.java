// copy all the element of stack to another stack in same order
package Stack;
import java.util.Stack;

public class copyStack {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        // Reverse order of stack
        Stack<Integer> temp= new Stack<>();
        while(st.size()>0){
            int x = st.peek();
            temp.push(x);
            st.pop();
        }
        System.out.println(temp);

        Stack<Integer> rt= new Stack<>();
        while(temp.size()>0){
            rt.push(temp.pop());
        }
        System.out.println(rt);

    }

}