package randomDayOne;

import java.util.*;

public class SubstringsWithKDistinctLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String str = sc.next();
        System.out.println(countSubstrings(str, k));
    }

    public static int countSubstrings(String s, int k) {
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0, j = 0; i < s.length() && j < s.length(); i++) {

            if (set.contains(s.charAt(i))) {
                set.clear();
                i = j++;
            } else {
                set.add(s.charAt(i));
            }
            if (set.size() == k) {
                count++;
            }
        }
        return count;
    }


}
