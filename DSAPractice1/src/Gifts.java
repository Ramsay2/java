import java.util.*;

public class Gifts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            System.out.println(gifts(arr, n));

        }
    }

    static int gifts(int[] arr, int n) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0, j = 0;
        for (int i = 0; i < n; i++) {

            if (map.containsKey(arr[i])) {
            j = Math.max(map.get(arr[i]),  j);
            }
            ans = Math.max(ans, i - j + 1);

            map.put(arr[i], i + 1);
        }
        return ans;
    }
}
