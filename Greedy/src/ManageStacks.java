import java.util.Arrays;
import java.util.Scanner;

public class ManageStacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- != 0) {
            int n = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
            int [] arr = new int[n];
            while (n-- != 0) {
                int initial = sc.nextInt();
                int fin = sc.nextInt();
                arr[n] = fun(x, y, initial, fin);


            }
            Arrays.sort(arr);
            System.out.println(arr[0]);
        }

    }

    public static int fun(int x, int y, int initial, int fin) {
        int count = 0;
        while (initial != fin && initial >= 0 && fin >= 0) {
            if (initial > fin) {
                count += x + y;
                initial--;
            }
            if (initial < fin) {
                count += x + y;
                initial++;
            }

        }
        return count;
    }
}
