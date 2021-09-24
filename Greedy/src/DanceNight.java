import java.util.Arrays;
import java.util.Scanner;

public class DanceNight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int m = sc.nextInt(), n = sc.nextInt();
            int[] boys = new int[m];
            int[] girls = new int[n];
            for (int i = 0; i < m; i++) boys[i] = sc.nextInt();
            for (int i = 0; i < n; i++) girls[i] = sc.nextInt();

            Arrays.sort(boys);
            Arrays.sort(girls);

            if (m > n) {
                System.out.println("NO");
            } else {
                boolean flag = true;
                for (int i = 0; i < m; i++) {

                    if (girls[i] >= boys[i]) {
                        flag = false;
                        break;
                    }
                }
                if(flag) {
                    System.out.println("YES");
                }else {
                    System.out.println("NO");
                }

            }
        }
    }
}