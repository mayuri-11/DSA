package Stack;
import java.util.ArrayList;
// Implement stacl using ArrayList
public class StackArrayList {
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();

        public boolean isEmpty(){
            return list.size() == 0;
        }

        public void push(int data){
            list.add(data);
        }

        public int pop(){
            if(isEmpty()){
                return -1;
            }else{
                int top = list.get(list.size()-1);
                list.remove(list.size()-1);
                return top;
            }
        }

        public int peek(){
            if(isEmpty()){
                return -1;
            }else{
                int data = list.get(list.size()-1);
                return data;
            }
        }
    }


    public static void main(String[] args) {
        Stack obj = new Stack();
        obj.push(10);
        obj.push(20);
        obj.push(30);

        while (!obj.isEmpty()) {
            System.out.println(obj.peek());
            obj.pop();
        }
    }
}
