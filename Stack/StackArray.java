// Implement Stack using Array
package Stack;

public class StackArray {
    public static class Stack{
        private int[] arr = new int[5];
        int idx = 0;
        
        void push(int x){
            arr[idx] = x;
            idx++;
        }

        int pop(){
        
            if(idx == 0) return -1;
            int top = arr[idx-1];
            arr[idx] = 0;
            idx--;
            return top;
                
        }

        void display(){
            int i=0;
            while(i<idx-1){
                System.out.print(arr[i] + " ");
                i++;
            }
            System.out.println();
        }

        int capacity(){
            return arr.length;
        }

        int peekk(){
            if(idx == 0){
                System.out.println("Stack is Empty");
                return -1;
            }
            return arr[idx-1];

        }

        public static void main(String[] args) {
            Stack s = new Stack();
            s.push(1);
            s.push(2);
            s.push(3);
            s.push(4);

            s.display();
            System.out.println(s.peekk());

        }
    }
}
