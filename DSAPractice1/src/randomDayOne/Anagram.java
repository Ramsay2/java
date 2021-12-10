package randomDayOne;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            String s1 = sc.next();
            String s2 = sc.next();
            if (s1.length() != s2.length()) {
                System.out.println("False");
            } else {
                char[] arr1 = s1.toCharArray();
                char[] arr2 = s2.toCharArray();
                Arrays.sort(arr1);
                Arrays.sort(arr2);
                if (Arrays.equals(arr1, arr2)) {

                    System.out.println("True");
                } else {
                    System.out.println("False");
                }
            }
        }
    }
}
