package randomDayOne;

import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String s1 = sc.next();
            String s2 = sc.next();
            if (s1.length() != s2.length()) {
                System.out.println("No");
            } else {
                char[] arr1 = s1.toCharArray();
                char[] arr2 = s2.toCharArray();
                Arrays.sort(arr1);
                Arrays.sort(arr2);
                if (Arrays.equals(arr1, arr2)) {

                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }

        }
    }
}
