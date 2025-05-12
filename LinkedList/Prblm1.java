// Find Nth Nod from the end of the linkedlist
package LinkedList;

public class Prblm1{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node nthNode(Node head, int n){
        Node slow = head;
        Node fast = head;

        for(int i=1; i<=n; i++){
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
            
        }
        return slow;
    }

    public static Node deleteNthFromEnd(Node head, int n){
        Node slow = head;
        Node fast = head;

        for(int i=1; i<=n; i++){
            fast = fast.next;
        }

        if(fast == null){
            head = head.next;
            return head;
        }

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return head;
       
    }

    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node(7);
        Node b = new Node(0);
        Node c = new Node(45);
        Node d = new Node(178);
        Node e = new Node(4);
        Node f = new Node(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        //Node ans = nthNode(a, 5);
        //System.out.println(ans.data);

        display(a);
        a = deleteNthFromEnd(a, 6);
        display(a);

    }
}