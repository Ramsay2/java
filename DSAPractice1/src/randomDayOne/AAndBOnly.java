package randomDayOne;

import java.util.Scanner;

public class AAndBOnly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());

        if(sb.charAt(0) == '?' && sb.charAt(1) == 'a') {
            sb.setCharAt(0, 'b');
        }else if(sb.charAt(0) == '?' ) {
            sb.setCharAt(0, 'a');
        }

        for (int i = 0; i < sb.length(); i++) {

            if (sb.charAt(i) == '?') {
                if (i - 1 >= 0 && ( sb.charAt(i - 1) == 'a' || (i + 1 < sb.length() && sb.charAt(i + 1) == 'a')) ) {
                    sb.setCharAt(i, 'b');
                }else {
                    sb.setCharAt(i, 'a');
                }
            }
        }
        System.out.println(sb);
    }
}
