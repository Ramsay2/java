import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            System.out.println(sqrt(n));
        }
    }

    public static int sqrt(int n) {

        int start = 0, end = n, mid;

        int temp = 0;

        while (start <= end) {
            mid = (start + end) / 2;

            if (mid * mid == n) {
                temp = mid;

                break;

            }

            if (mid * mid < n) {
                start = mid + 1;
                temp = mid;
            }else {
                end = mid - 1;
            }
        }
        return temp;
    }
}