import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int k = sc.nextInt();
            System.out.println(findMax(a, b, c, k));
        }

    }

    public static long findMax(int a, int b, int c, int k) {

        long start = 0, end = k, ans = 0;

        if(k < c) return 0;
        ArrayList<Long> list = new ArrayList<>();
        while (start <= end) {

            long mid = start + (end - start) / 2;
            long temp = a * mid * mid + b * mid + c;
            if (temp > k) {
                end = mid - 1;
            } else {
                list.add(mid);
                start = mid + 1;
                ans ++;
            }
        }
        Collections.sort(list);
        return list.get((int)(ans -1));

    }
}
