import java.util.LinkedList;

public class ReverseLinkedList {

  public static void main(String[] args) {
    Node node = new Node();
    node.next = new Node(1);
    node.next.next = new Node(2);
    node.next.next.next = new Node(3);
    node.next.next.next.next = new Node(4);
    node.next.next.next.next.next = new Node(5);
    System.out.println(Solution.reverseLinkedList(node));
  }

  static class Node {
    int data;
    Node next;

    public Node(int data, Node next) {
      this.data = data;
      this.next = next;
    }

    public Node(int data) {
      this.data = data;
      this.next = null;
    }

    public Node() {
      this.data = 0;
      this.next = null;
    }
  }

  static class Solution {
    public static int reverseLinkedList(Node head) {
      Node first = head;
      Node last = head;
      Node temp = head;
      int count = 0;
      while (temp != null) {
        count++;
        temp = temp.next;
      }


      if (count % 2 == 1) {
        while (first.next != null && last.next != null) {
          last = last.next.next;
          first = first.next;
        }
        return first.data;
      } else {
        while (first != null && last.next.next != null) {
          last = last.next.next;
          first = first.next;

        }
        return first.next.data;
      }

    }


  }
}
