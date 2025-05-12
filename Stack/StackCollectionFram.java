package Stack;
import java.util.*;
// Implement stack using collection framwork
public class StackCollectionFram {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(45);
        s.push(67);
        s.push(89);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
