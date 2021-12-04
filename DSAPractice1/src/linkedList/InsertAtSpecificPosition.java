package linkedList;

class Node{
  int data;
  Node next;

  public Node(int data,Node next){
    this.data = data;
    this.next = next;
  }
  public Node(int data){
    this.data = data;
    this.next = null;
  }
  public Node(){
    this.data = 0;
    this.next = null;
  }
}

class Solution{
    public static Node insertNodeAtPosition(Node a,int val,int pos){
        Node temp = a;
        int count = 0;

        if(pos == 0){
            Node newNode = new Node(val,temp.next);
            temp.next = newNode;
            return a;

        }
        while(count < pos){
            temp = temp.next;
            count++;
        }
        Node newNode = new Node(val,temp.next);
        temp.next = newNode;
        return a;
    }
}

