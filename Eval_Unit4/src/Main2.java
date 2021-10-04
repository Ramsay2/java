import java.util.Scanner;

public class Main2 {
    public static int ans = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = i + 1;
        fun(arr, 0, n - 1, a, b);
        System.out.println(ans);
    }

    public static void fun(int[] arr, int left, int right, int a, int b) {


        if (left == right) {
            int count = 0;
            for (int i = a; i <= b; i++) {

                count += arr[i];
            }
            if (count % 2 != 0)
                ans++;
            return;
        }

        for (int i = left; i <= right; i++) {
            swap(arr, left, i);
            fun(arr, left + 1, right, a, b);
            swap(arr, left, i);


        }

    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
