package stacks;

import java.util.Scanner;
import java.util.Stack;

public class StringWithParenthesis {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '['){
                stack.push(str.charAt(i));

            }else if(str.charAt(i) == ')'){
                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                }else {
                    System.out.println("unbalanced");
                    break;
                }
            }else if(str.charAt(i) == ']'){
                if(!stack.isEmpty() && stack.peek() == '['){
                    stack.pop();
                }else {
                    System.out.println("unbalanced");
                    break;
                }
            }else if(str.charAt(i) == '}'){
                if(!stack.isEmpty() && stack.peek() == '{'){
                    stack.pop();
                }else {
                    System.out.println("unbalanced");
                    break;
                }
            }
        }
        if (stack.isEmpty()){
            System.out.println("balanced");
        }
    }
}
