package Queues;
import java.util.*;
public class QueueCollectionFram {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println(q);

        q.remove(); // q.poll()   --> Both works same
        System.out.println(q);

        System.out.println(q.element()); // q.peek()  --> Both works same

        System.out.println(q.size());
 
    }
}
