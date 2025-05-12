package LinkedList;

public class practise {
    Node head;
   
    private int size;
    practise(){
     size = 0;
    }

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(String data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void printList(){
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        
        }
    }

    public void  addLast(String data){
        Node currNode = new Node(data);
        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = currNode;
    }

    public void deleteFirst(){
        head = head.next;

    }

    public void deleteLast(){
        if (head.next == null) {
            return ;
        }
        Node seconnd_last = head;
        while(seconnd_last.next.next != null){
            seconnd_last = seconnd_last.next;
        }

        seconnd_last.next = null;
        
    }

    public void insertAtIdx(String data, int idx){
        Node newNode = new Node(data);
        Node currNode = head;
        for(int i=0; i<idx-1;i++){
            if(currNode.next != null){
                currNode = currNode.next;
            }
        }
        if (currNode == null) {
            System.out.println("Position out of bounds");
            return;
        }

        newNode.next = currNode.next;
        currNode.next = newNode;
    }

    public static void main(String[] args) {
        practise list = new practise();
        list.addFirst("Hello");
        // list.addFirst("my");
        // list.addFirst("name");
        // list.addFirst("mayuri");
        // list.addLast("!");
        // list.addLast("@");
        //list.printList();
        //list.deleteFirst();
        //list.printList();
        //list.deleteLast();

        list.insertAtIdx("i", 1);
        list.insertAtIdx("I", 2);
        list.insertAtIdx("mayuri", 1);
        list.insertAtIdx("am", 2);

        
        list.printList();

    }
    
}
