class DeleteNode {
    int data;
    Node next;

    public DeleteNode(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public DeleteNode(int data) {
        this.data = data;
        this.next = null;
    }

    public DeleteNode() {
        this.data = 0;
        this.next = null;
    }
}

class Solution2 {
    public static Node deleteNode(Node a,int pos){
        Node temp = null;
        Node k = a;
        int count = 0;
        if (pos == 0) {
            temp = k.next;
            return temp;

        } else {
            while (k != null && pos-- != -1) {
                count++;
                if (count == pos + 1) {
                    temp = k.next;
                    break;
                }
                k = k.next;
            }
        }
        return temp;
    }
}