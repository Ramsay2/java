package randomDayOne;

import java.util.*;

public class TwoSubArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt();
            String str = sc.next();

            System.out.println(substrings(str));
        }
    }

    static int substrings(String str) {
        int ans = 0;


        int[] count = new int[26];

        int i, j, n = str.length();
        for (i = 0; i < n; i++) {
            Arrays.fill(count, 0);

            for (j = i; j < n; j++) {

                count[str.charAt(j) - 'a']++;

                if (count[str.charAt(j) - 'a'] <= 2) {
                    ans++;
                } else {
                    break;
                }
            }
        }

        return ans;
    }
}
