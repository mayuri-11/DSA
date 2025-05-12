package Queues;
// Implement Queue using Linkedlist
public class QueueLinked {
    public static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class queueLL{
        Node head = null;
        Node tail = null;
        int size = 0;

        public void add(int x){
            Node temp = new Node(x);
            if(size == 0){
                head = tail = temp;
            }
            else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public int peek(){
            if(head == null) return -1;
            return head.data;
        }

        public int remove(){
            if(head == null) return -1;
            int x = head.data;
            head = head.next;
            size--;
            return x;
        }

        public void dispaly(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public static void main(String[] args) {
            queueLL q = new queueLL();
            q.add(1);
            q.add(2);
            q.add(45);
            q.dispaly();
            System.out.println(q.peek());
            q.remove();
            q.dispaly();
        }
    }
}
