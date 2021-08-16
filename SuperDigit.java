import java.util.Scanner;

public class SuperDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        System.out.println(finalSum(n, k));

    }

    public static long digitSum(long n) {

        if (n < 10) {
            return n;
        }
        long sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return digitSum(sum);
    }
    public static long finalSum(long n, long k){
        long sum = k*digitSum(n);
        return digitSum(sum);
    }
}
