import java.util.Scanner;

public class MystryArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println(fun(arr, k, n));
    }

    public static int fun(int[] arr, int k, int n) {
        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                while (arr[i] >= arr[i + 1]) {
                    arr[i + 1] += k;

                    count++;
                }
            }
        }
        return count;
    }
}
