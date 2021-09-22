
class Node {
    Node next;
    int data;
}
class Linked {

    public boolean rearrangeLinkedListZigzag(Node head) {

        Node low = head, high = head.next;
        boolean flag = low.data < high.data;

        if (flag) {
            while (high.next != null) {
                if (low.data > high.data) {
                    return false;
                }
                low = low.next.next;
                high = high.next.next;
                if (low.data > high.data) {
                    return false;
                }

            }
            Node newLow = head.next, newHigh = head.next.next;

            while (newHigh.next.next != null && newHigh.next.next.next != null) {
                if (newLow.data < newHigh.data) {
                    return false;
                }
                newLow = newLow.next.next;
                newHigh = newHigh.next.next;
            }
        } else {
            while (high.next != null) {
                if (low.data < high.data) {
                    return false;
                }
                low = low.next.next;
                high = high.next.next;
            }
            Node newLow = head.next, newHigh = head.next.next;

            while (newHigh.next.next.next != null) {
                if (newLow.data > newHigh.data) {
                    return false;
                }

                newLow = newLow.next.next;
                newHigh = newHigh.next.next;

                if (newLow.data > newHigh.data) {
                    return false;
                }

            }
        }

        return true;


    }

    public Node getNewNode(int key) {
        Node a = new Node();
        a.next = null;
        a.data = key;
        return a;
    }

    public Node insert(int key, Node node) {

        if (node == null)
            return getNewNode(key);
        else
            node.next = insert(key, node.next);

        return node;
    }


}

public class Main {
    public static void main(String[] args) {
        Linked a = new Linked();

        Node head = null;

        head = a.insert(4, head);
        head = a.insert(7, head);
        head = a.insert(3, head);
        head = a.insert(6, head);
        head = a.insert(4, head);
        head = a.insert(2, head);

        boolean zigZagList = a.rearrangeLinkedListZigzag(head);
        System.out.println(zigZagList);

    }
}