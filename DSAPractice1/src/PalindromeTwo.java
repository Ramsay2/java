import java.util.*;

public class PalindromeTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            String str = sc.next();

            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < str.length(); i++) {
                if (map.containsKey(str.charAt(i))) {
                    map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
                } else {
                    map.put(str.charAt(i), 1);
                }
            }
            int count = 0;
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (count > 1) {
                    break;
                }
                if (entry.getValue() % 2 != 0) {
                    count++;
                }
            }
            if (count < 2) {
                System.out.println("Possible!");
            }else {
                System.out.println("Not Possible!");
            }
        }
    }
}
