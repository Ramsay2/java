import java.util.LinkedList;

public class nthNodeFromEnd {


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
        public int nthNode(Node head, int n) {

            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            int ans = 0;
            while (head != null) {
                ans++;
                if (ans == count - n + 1) {
                    return head.data;
                }
                head = head.next;

            }
            return 0;

        }

    }


}

