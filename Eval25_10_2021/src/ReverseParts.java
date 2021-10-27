import java.util.Scanner;

public class ReverseParts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int m = sc.nextInt();
        int x = sc.nextInt();

        System.out.println(reverse(str,m,x));
    }

    public static String reverse(String str, int m, int x) {

        char[] ch = str.toCharArray();
        char[] temp = str.toCharArray();
        String ans = "";
        int l = 0;
        for (int i = x; i >= m; i--) {
            temp[m + l] = ch[i];
            l++;
        }
        for(int i = 0; i < str.length(); i++){
            ans+=temp[i];
        }
        return ans;
    }
}
