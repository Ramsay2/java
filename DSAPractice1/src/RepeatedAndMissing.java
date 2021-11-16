import java.util.Scanner;

public class RepeatedAndMissing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            missing(arr, n);
            System.out.println();
        }
    }

    static String missing(int[] arr, int n) {
        int a, b = -1;
        String ans = "-1";
        int sqrSum = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            sqrSum += arr[i] * arr[i];
            sum += arr[i];
        }
        int s = sum ;
        System.out.println(sqrSum);
        System.out.println(sum +" " + n * (n + 1) / 2 );
        int sq = (sqrSum - n * (n + 1) * (2 * n + 1) / 6) / s;
        System.out.println(n * (n + 1) * (2 * n + 1) / 6);
        a = (s + sq) / 2;
       // System.out.println(a);

        return ans;
    }
}
