import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {

            int n = sc.nextInt();
            System.out.println(column(n));

        }
    }

    public static int column(int n) {


        if (n == 0) {
            return 1;
        }
        if (n < 4) {
            return 0;
        }
        if (n < 8) {
            return column(n - 4);
        }
        return column(n -8)+ column(n - 4);
    }
}
