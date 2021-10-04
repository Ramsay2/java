import java.util.Arrays;
import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            Arrays.sort(arr);
            int[] ans = new int[n];

            for (int i = 0; i < n; i++) {
                int count = 0;
                for (int j = i; j < n; j++) {
                    count += arr[i];
                }
                System.out.println(count);
                ans[i] = count;
            }
            int [] ar3 = new int[n];
            for (int i = 0; i < n; i++) {
                ar3[i] = ans[i] - i;
                System.out.println(ar3[i]);
            }
            Arrays.sort(ar3);
            System.out.println(ar3[n - 1]);
        }
    }

}
