class Node2 {
    int data;
    Node2 next;

    public Node2(int data, Node2 next) {
        this.data = data;
        this.next = next;
    }

    public Node2(int data) {
        this.data = data;
        this.next = null;
    }

    public Node2() {
        this.data = 0;
        this.next = null;
    }
}

class Solution3 {
    public Node mergeTwoLinkedList(Node a, Node b) {
        Node nodeA = a, nodeb = b;
        Node ans = new Node();
        Node temp = ans;
        String str = "";
        temp.data = Integer.parseInt(str);

        while (nodeA != null && nodeb != null) {
            if (nodeA.data <= nodeb.data) {

                temp.next = nodeA;
                nodeA = nodeA.next;
            } else {

                temp.next = nodeb;
                nodeb = nodeb.next;
            }
            temp = temp.next;
        }
        if (nodeA != null) {
            temp.next = nodeA;
        } else if (nodeb != null) {
            temp.next = nodeb;
        }
        return ans.next;
    }

}

