import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            System.out.println(squareRoot(n));
        }
    }

    public static long squareRoot(int n) {

        long start = 0, end = n, mid;

        long temp = 0;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (mid * mid == n) {
                temp = mid;
                break;
            }

            if (mid * mid < n) {
                start = mid + 1;
                temp = mid;
            } else {
                end = mid - 1;
            }
        }
        return temp;
    }
}