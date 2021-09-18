import java.util.Scanner;

public class MinimizeCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = {1, 2, 5, 10, 20, 50, 100, 500, 1000};

        while (t-- != 0) {
            int n = sc.nextInt();
            int ans = 0;
            for (int i = arr.length - 1; i >= 0; i--) {

                while (n >= arr[i]) {
                    n -= arr[i];
                    ans++;
                }
            }

            System.out.println(ans);
        }
    }


}
