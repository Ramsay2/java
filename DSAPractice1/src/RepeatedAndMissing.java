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
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i <= n / 2; i++) {
            if (set.contains(arr[i])) {
                ans = arr[i] + "";
            }
                set.add(arr[i]);
                set.add(n - 1 - i);

        }
        for (int i = 1; i <= n / 2; i++) {

            if (!set.contains(i) ) {
                System.out.println(i + " " + ans);
                break;
            }if(!set.contains(n + 1 - i)){
                System.out.println((n + 1 - i) + " " + ans);
                break;
            }
        }

    }
}
