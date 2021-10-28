import java.util.Scanner;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        int max = 0;
        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {
                boolean flag = true;
                for (int k = i; k < j - i + 1; k++) {
                    if (str.charAt(k + i) != str.charAt(j - k)) {
                        flag = false;
                        break;
                    }
                }
                if (flag && max < j - i + 1) {
                    max = j - i + 1;
                }
            }

        }
        System.out.println(max);
    }


}
