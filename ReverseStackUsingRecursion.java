import java.util.Scanner;
import java.util.Stack;

public class ReverseStackUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack<String> stack = new Stack<>();
        while(!str.equals("-1")){
            stack.push(str);
        }
        System.out.println(stack);
    }
}