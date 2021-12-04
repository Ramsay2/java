package linkedList;

class Node2 {
    int data;
    Node next;

    Node2() {
        this.data = 0;
        this.next = null;
    }

    Node2(Node next, int data) {
        this.data = data;
        this.next = next;
    }

    Node2(int data) {
        this.data = data;
        this.next = null;
    }
}


class Solution2 {
    public int middleNode(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        assert slow != null;
        return slow.data;
    }

}

