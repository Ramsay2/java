/*

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
    public static boolean detectPalindrome(Node2 a) {

        Node2 slow = a, fast = a, temp = a;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        reverse(slow);
        while(slow != null){

            if(temp.data != slow.data){
                return false;
            }
            temp = temp.next;
           slow =  slow.next;
        }
        return true;
    }

    private static Node2 reverse(Node2 a) {

        Node2 temp = a;
        Node2 ans = null;
        while (temp != null) {
            Node2 node = temp.next;
            temp.next = ans;
            ans = temp;
            temp = node;
        }
        return ans;
    }
}
*/
