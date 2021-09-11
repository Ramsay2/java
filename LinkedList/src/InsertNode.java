class Node {
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

class Solution {
    public static Node insertAtTail(Node a, int val, int pos) {
        Node temp, k = a;
        ;
        int count = 0;
        if (pos == 0) {
            temp = k.next;
            return temp;

        } else {
            while (k != null && count < pos) {

                    k = k.next;
                count++;
            }
        }
        assert false;
        temp = k.next.next;
        k.next = temp;
        return a;
    }
}