import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            int k = sc.nextInt();
            String odd = "", even = "";
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 1) even += arr[i] + " ";
                else odd += arr[i] + " ";
            }

            if (k == 1) System.out.println(even + odd);
            else System.out.println(odd + even);

        }
    }
}
