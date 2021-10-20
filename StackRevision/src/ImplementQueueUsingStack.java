import java.util.Stack;

class Solution{
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void add(int data){
      while (!stack1.isEmpty()){
          stack2.push(stack1.pop());
      }
      stack1.push(data);

      while (!stack2.isEmpty()){
          stack1.push(stack2.pop());
      }
    }

    public int remove(){

       if(stack1.isEmpty()){
           System.out.println(0);
       }
       return stack1.pop();
    }

    public int front(){
        return stack2.peek();
    }
}
