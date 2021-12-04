package linkedList;

class Node1{
  int data;
  Node next;

  public Node1(int data,Node next){
    this.data = data;
    this.next = next;
  }
  public Node1(int data){
    this.data = data;
    this.next = null;
  }
  public Node1(){
    this.data = 0;
    this.next = null;
  }
}

class insert{
    public static Node insertAtTail(Node a, int val){
        if(a == null){
            return new Node(val);
        }
        Node temp = a;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(val);
        return a;
    }
}
