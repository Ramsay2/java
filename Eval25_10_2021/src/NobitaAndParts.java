import java.util.Scanner;

public class NobitaAndParts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String str = sc.next();
        String ans = "";
        while (m-- != 0) {
            int k = sc.nextInt();
            int l = sc.nextInt();
            ans = swap(str, k, l);
            str = ans;
        }
        System.out.println(ans);
    }

    public static String swap(String str, int k, int l) {
        char[] ch = str.toCharArray();
        char[] temp = str.toCharArray();
        StringBuilder ans = new StringBuilder();
        int x = 0;
        for (int i = l; i >= k; i--) {
            temp[k + x] = ch[i];
            x++;
        }

        for (int i = 0; i < ch.length; i++) {
        ans.append(temp[i]);
        }
        return ans.toString();
    }
}
