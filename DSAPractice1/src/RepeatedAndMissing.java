import java.util.*;

public class RepeatedAndMissing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            missing(arr, n);
        }
    }

    static void missing(int[] arr, int n) {

        String ans = "-1";
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                ans = arr[i] + "";
            } else {
                map.put(arr[i], 1);
            }
        }
        for (int i = 1; i <= n; i++) {
            if (!map.containsKey(i)) {
                System.out.println(i + " " + ans);
                break;
            }
        }

    }
}
