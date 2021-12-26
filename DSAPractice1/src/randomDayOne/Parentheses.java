package randomDayOne;

import java.util.*;
public class Parentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- != 0) {
            String str = sc.next();

            if (isBalanced(str)) {
                System.out.println("balanced");
            } else {
                System.out.println("not balanced");
            }
        }

    }

    static boolean isBalanced(String str) {
        Stack<Character> stk = new Stack<>();
        if (str.length() % 2 == 1 || str.charAt(0) == ')' || str.charAt(0) == '}' || str.charAt(0) == ']') {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                stk.push(str.charAt(i));
            } else {

                if (stk.peek() == '(' && str.charAt(i) != ')') {
                    return false;
                } else if (stk.peek() == '[' && str.charAt(i) != ']') {
                    return false;
                } else if (stk.peek() == '{' && str.charAt(i) != '}') {
                    return false;
                } else {
                    stk.pop();
                }
            }
        }
        return stk.isEmpty();
    }
}
