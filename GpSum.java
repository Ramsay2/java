import java.util.Scanner;

public class GpSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.printf("%.5g%n%n", sum(n, m));
    }

    public static double sum(int n, int m) {
        if (n == 0) {
            return 1;
        }
        return  1 / Math.pow(m, n) + sum(n - 1, m);
    }
}