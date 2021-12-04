package linkedList;

/*
class Node{
  int data;
  Node next;

  public Node(int data,Node next){
    this.data = data;
    this.next = next;
  }
  public Node(int data){
    this.data = data;
    this.next = null;
  }
  public Node(){
    this.data = 0;
    this.next = null;
  }
}
*/

class Solution7 {
    public static Node reverseLinkedList(Node a) {
        Node prev = null;
        Node current = a;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        a = prev;
        return a;
    }

}

class Solution8 {
    public static Node mergeTwoLinkedList(Node a, Node b) {
        if (a == null) {
            return b;
        } else if (b == null) {
            return a;
        }


     Node ans = null;
        if (a.data <= b.data) {
            ans = a;
            a = a.next;
        } else {
            ans = b;
            b = b.next;
        }

   Node merged = ans;

        while (a != null && b != null) {
        Node temp = null;
            if (a.data <= b.data) {
                temp = a;
                a = a.next;
            } else {
                temp = b;
                b = b.next;
            }

            merged.next = temp;
            merged = temp;
        }

        if (a != null) {
            merged.next = a;
        } else if (b != null) {
            merged.next = b;
        }

        return ans;
    }
}
