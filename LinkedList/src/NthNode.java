class NthNode {
    int data;
    Node next;

    public NthNode(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public NthNode(int data) {
        this.data = data;
        this.next = null;
    }

    public NthNode() {
        this.data = 0;
        this.next = null;
    }
}

class Solution1 {
    public static Node insertAtTail(Node head, int n) {

        Node temp = head;
        return temp;
    }
}