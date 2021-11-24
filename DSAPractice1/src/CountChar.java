import java.util.*;

public class CountChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        count(str);

    }

    public static void count(String str) {
        int n = str.length();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = i; j < n; j++) {
                if (str.charAt(i) != str.charAt(j)) {

                    break;
                }
                count++;
            }
            char ch = 66;
            System.out.println(ch);
            builder.append(str.charAt(i)).append(count);
            i = i + count - 1;
        }


        System.out.println(builder);
    }
}
