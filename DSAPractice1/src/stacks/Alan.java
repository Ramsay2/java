package stacks;

import java.util.*;

  public class Alan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            String s = sc.next();
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                if(!stack.empty() && s.charAt(i) == '#') {
                    stack.pop();
                }else if(s.charAt(i) != '#'){
                    stack.push(s.charAt(i));
                }
            }
            for (Character c : stack) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
