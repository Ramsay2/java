package slidingWindow;

import java.util.Scanner;

public class SubstringsWithKDistinctLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String str = sc.next();
        int count = 0;
        boolean flag = true;
        for (int i = 0; i < n ; i++) {
            for (int j = i; j < n && j < (k + i); j++) {
                if (str.charAt(j) == str.charAt(k + i - j - 1)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
            }
        }
        System.out.println(count);
    }
}
