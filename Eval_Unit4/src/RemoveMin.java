// Java program to delete middle
// of a linked list

import java.io.*;
import java.util.ArrayList;

class GFG {

    /* Link list Node */
    static class Node {
        int data;
        Node next;
    }

    // Utility function to create a new node.
    static Node newNode(int data) {
        Node temp = new Node();
        temp.data = data;
        temp.next = null;
        return temp;
    }

    // count of nodes
    static int countOfNodes(Node head) {
        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }
        return count;
    }

    static Node deleteMid(Node head) {
        if(head == null) return null;
        Node min = head;
        Node temp = head;
        Node pre = null;

        while(temp != null) {
            if(temp.next != null && temp.next.data < min.data){
                min = temp.next;
                pre = temp;
            }
            temp = temp.next;
        }

        if(min != head) {
            pre.next = min.next;
        } else {
            head = head.next;
        }

        return head;
    }


    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }

    }

    /* Driver code*/
    public static void main(String[] args) {
        /* Start with the empty list */
        Node head = newNode(1);
        head.next = newNode(2);
        head.next.next = newNode(3);
        head.next.next.next = newNode(4);
        head.next.next.next.next = newNode(5);

        head = deleteMid(head);

        printList(head);
    }
}

// This code is contributed by rajsanghavi9.
