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
        Node temp = new Node(val);
        Node k = a;
        if (pos == 0) {
            temp = k.next;
            return temp;
        } else {
            while (pos-- != -1) {

                if (pos == 0) {
                    temp.next = k.next;
                    k.next = temp;
                    break;
                }

                k = k.next;
            }
        }
        return a;
    }
}