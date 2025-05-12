package Stack;
// Implement stack using Linkedlist;
public class StackLinkedList {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            next = null;
        }
        
    }

    static class Stack{
        public static Node head;
        public static boolean isEmpty(){
            return head == null;
        }

        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
            }else{
                newNode.next = head;
                head = newNode;
            }
        }

        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }


    public static void main(String args[]){
        new Stack();
        Stack.push(7);
        Stack.push(8);
        Stack.push(9);
        Stack.push(12);

        while(!Stack.isEmpty()){
            System.out.println(Stack.peek());
            Stack.pop();
        }
    }
}
