import java.util.Scanner;

public class SubSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        char[] ch = new char[n];
        for (int i = 0; i < n; i++) {
            ch[i] = str.charAt(i);
        }
       sub("", ch, 0, n - 1);
    }

   public static void sub(String ans, char[] ch, int low, int high) {
        if (low <= high + 1 && !ans.equals("")) {
            System.out.println(ans);
        }
        for (int i = low; i <= high; i++) {
            sub(ans + ch[i], ch, i + 1, high);
        }
    }
}