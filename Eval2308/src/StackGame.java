import java.util.Scanner;
import java.util.Stack;

public class StackGame {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- != 0) {
            int k = sc.nextInt();
            int m = sc.nextInt();
            String str = sc.next();
            if (m != k) {
                System.out.println("no");
            } else {

                Stack<Character> stk = new Stack<>();
                int n = 0;
                while (n++ != str.length() - 1) {
                    if (str.charAt(n) == '(') {
                        stk.push('(');
                    } else if (str.charAt(n) == ')' && !stk.empty()) {
                        stk.pop();
                    }


                }
                if (stk.empty()) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        }
    }
}

