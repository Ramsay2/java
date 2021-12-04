package binarySearch;

import java.util.HashSet;
import java.util.Scanner;

public class MakeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String str1= sc.next();
            String str2= sc.next();
            HashSet<Character> set = new HashSet<>();
            for (int i = 0; i < str1.length(); i++) {
                set.add(str1.charAt(i));
            }
            boolean flag = true;
            for (int i = 0; i < str2.length(); i++) {
                if (!set.contains(str2.charAt(i))) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
    }
}
