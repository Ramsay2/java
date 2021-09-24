import java.util.Arrays;
import java.util.Scanner;

public class ManageStacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- != 0) {
            int n = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
            int[] initial = new int[n];
            int[] fin = new int[n];
            for (int i = 0; i < n; i++) {
                initial[i] = sc.nextInt();
                fin[i] = sc.nextInt();
            }
            Arrays.sort(initial);
            Arrays.sort(fin);
            int ans = 0;
            for (int i = 0; i < n; i++) {
                if (initial[i] < fin[i]) {
                    ans += (fin[i] - initial[i]) * x;
                } else {
                    ans += (initial[i] - fin[i]) * y;
                }
            }
            System.out.println(ans);
        }

    }

}
