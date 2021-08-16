import java.util.Scanner;

public class Main3 {
    static int temp = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            long k = 1;
            long m = 1;
            long l = 1;
            for (int i = 1; i <= 2 * n; i++) {
                k *= i;
                if (i <= n) {
                    m *= i;
                }
                if (i <= n + 1) {
                    l *= i;
                }
            }
            System.out.println(k / (m * l));
            sub("", 0, 0, n);

        }
    }

    public static void sub(String str, int open, int close, int n) {

        if (str.length() == 2 * n) {
            temp++;
            System.out.println(str);
            return;
        }

        if (open < n) {
            sub(str + "(", open + 1, close, n);

        }
        if (open > close) {

            sub(str + ")", open, close + 1, n);
        }

    }
}