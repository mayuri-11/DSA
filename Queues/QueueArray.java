package Queues;
// Implement Queue using Array
public class QueueArray{
    
    public static class queueArray{
        int f = -1;
        int r = -1;
        int size = 0;
        int[] arr = new int[5];

        public void add(int val){
            if (r == arr.length - 1) {
                System.out.println("Queue is full");
                return;
            }
            if (f == -1) {
                f = 0;
                r = 0;
                arr[0] = val;
            }
            else {
                arr[++r] = val;
            }
            size++;
        }

        public int remove(){
            if(size == 0){
                System.out.println("Queue is empty");
            }
            int x = arr[f];
            f++;
            size--;
            return x;
        }

        public int peek(){
            return arr[f];
        }

        public void dispaly(){
            if(size == 0){
                System.out.println("Queue is empty");
            }else{
                for(int i = f; i <= r; i++){
                    System.out.print(arr[i] + " ");
                }
            }
        }
        public static void main(String[] args) {
            queueArray q = new queueArray();
            q.add(8);
            q.add(2);
            q.add(3);
            q.add(45);
            q.dispaly();
        }
    }
}