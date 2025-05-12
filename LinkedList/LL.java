package LinkedList;

import java.util.LinkedList;

public class LL {
  Node head;
  private int size;
  LL () {
    size = 0;
  }


  class Node {
    String data;
    Node next;

    Node(String data) {
      this.data = data;
      this.next = null;
      size++;
    }
  }

  // Add first - optimized
  public void addFirst(String data) {
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
  }

  public void addLast(String data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      return;
    }
    
    Node lastNode = head;
    while(lastNode.next != null) {
      lastNode = lastNode.next;
    }


    lastNode.next = newNode;
  }

  // Print list
  public void printList() {
    Node currNode = head;
    if (head == null) {
      System.out.println("List is empty");
      return;
    }
   
    while (currNode != null) {
      System.out.print(currNode.data + "->");
      currNode = currNode.next;
    }
  }

  public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<String>();
    list.addFirst("My");
    list.addFirst("Name");
    list.addLast("Mayuri");
    list.addLast("Umaretiya");
    System.out.println(list);
  }
}
