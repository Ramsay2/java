import java.util.Scanner;

public class Main {
    public static boolean flag = true;
    public static int temp = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        while (m-- != 0) {
            int n = sc.nextInt();

            int[] arr = new int[n * 2 - 1];
            for (int i = 0; i < n * 2 - 1; i++) arr[i] = sc.nextInt();

            System.out.println(subset(arr, 0, n - 1));
        }
    }

    public static int subset(int[] arr, int n, int m) {

        if (arr[n] == arr[m]) {
            flag = false;
            return 0;
        }
        if (flag ) {
            temp = arr[m];
        }
        subset(arr, n + 1, m);
        subset(arr, n, m - 1);
        return temp;
    }
}
