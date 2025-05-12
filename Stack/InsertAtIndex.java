package Stack;

import java.util.Stack;

// Insert Element at Any index/ Bottom.
public class InsertAtIndex {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        int ele = 12;
        int idx = 5;
        Stack<Integer> temp= new Stack<>();

        while(st.size() > idx){
            temp.push(st.pop());
        }
        temp.push(ele);
        while(temp.size() > 0){
            st.push(temp.pop());
        }

        System.out.println(st);
    }
}
