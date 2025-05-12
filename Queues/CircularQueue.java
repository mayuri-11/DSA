// Implement Circular Queue using Array
package Queues;

public class CircularQueue {
    public static class Cqa{
        int front  = -1;
        int rear = -1;
        int size = 0;
        int arr[] = new int[5];

        public void add(int val) throws Exception{
            if(size == arr.length){
                throw new Exception("Queue is full");
            }
            else if(size == 0){
                front = rear = 0;
                arr[0] = val;
            }
            else if(rear<arr.length-1){
                arr[++rear] = val;
            }
            else if(rear == arr.length-1){
                rear = 0;
                arr[0] = val;
            }
            size++;
        }

        public int remove() throws Exception{
            if(size == 0){
                throw new Exception("Queue is empty");
            }else{
                int x = arr[front];
                if(front == arr.length-1) front = 0;
                else front++;
                size--;
                return x;
            }
            
        }

        public int peek() throws Exception{
            if(size == 0){
                throw new Exception("Queue is empty");
            }else{
                return arr[front];
            }
           
        }

        public void display(){
            if(size == 0){
                System.out.println("Queue is empty");
                return;
            }
            else if(front <= rear){
                for(int i = front; i <= rear; i++){
                    System.out.print(arr[i] + " ");
                }
            }
            else{
                for(int i = front; i < arr.length; i++){
                    System.out.print(arr[i] + " ");
                }
                for(int i = 0; i <= rear; i++){
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
    }  
    public static void main(String[] args) throws Exception {
        Cqa cq = new Cqa();
        cq.add(4);
        cq.add(5);
        cq.add(55);
        cq.display();
        System.out.println(cq.peek());

    }
}
