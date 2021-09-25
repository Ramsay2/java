import java.util.Scanner;

public class Max2InArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(fun(arr, n));
    }
    public static int fun(int[] arr, int n) {
      /*  int k = -1, ans = 0, count = 0, m = -1;
        for (int i = 0; i < n; i++) {
            int max = 0;
            if (i != k) {
                for (int j = i; j < n ; j++) {
                    if (max < arr[j]&& j != m) {
                        max = arr[j];
                        k = j;
                    }
                }
                m = k;
                count++;
                ans += max;
            }
            if (count == 2) break;

        }*/
        int max = 0, max2 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max2 = max;
                max = arr[i];
            } else if (arr[i] > max2)
                max2 = arr[i];

        }
        return max + max2;
    }
}