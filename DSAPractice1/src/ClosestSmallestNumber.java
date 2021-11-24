import java.util.Stack;

public class ClosestSmallestNumber{
    public static void prevSmallerNumber(int[] a){
        Stack<Integer> s = new Stack<Integer>();
        int popped = 0;

        for(int i = 0; i < a.length; i++){
            while(!s.isEmpty() && s.peek() >= a[i]){
                popped = s.pop();
            }
            if(s.isEmpty())
                System.out.print("_, ");
            else
                System.out.print(s.peek() + ", ");
            s.push(a[i]);
        }
    }
    public static void main(String[] args){
        int[] a = {1, 6, 4, 10, 2, 5};
        prevSmallerNumber(a);
    }
}