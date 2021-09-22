
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


class Solution11{
    public static boolean checkForCycle(Node head){
          Node slow = head, fast = head.next;
   while(slow != fast){
    if(fast == null || fast.next == null){
    return false;
    }
      slow = slow.next;
      fast = fast.next.next;
    }
    return true;
    }
}
