package recursion;

import java.util.Scanner;

public class GenerateAllSubsequence {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            String str = sc.next();
            char[] ch = str.toCharArray();

            subString("", ch, 0, n - 1);
        }

        public static void subString(String ans, char[] ch, int low, int high) {
            if (low <= high + 1 && !ans.equals("")) {
                System.out.println(ans);
            }
            for (int i = low; i <= high; i++) {
                subString(ans + ch[i], ch, i + 1, high);
            }
        }
    }

