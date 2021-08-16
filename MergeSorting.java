import java.util.Scanner;

public class MergeSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] n1 = new int[n];
        int[] n2 = new int[n];
        for (int i = 0; i < n; i++) n1[i] = sc.nextInt();
        for (int i = 0; i < n; i++) n2[i] = sc.nextInt();


        int k = 0, l = 0, m = 0;
        int[] ans = new int[2 * n];
        while (k != n && l != n) {
            if (n1[k] <= n2[l]) {
                ans[m] = n1[k];
                k++;
            } else if (n1[k] > n2[l]) {
                ans[m] = n2[l];
                l++;
            }
            m++;
        }
        while (k < n) {
            ans[m] = n1[k];
            k++;
            m++;
        }
        while (l < n) {
            ans[m] = n2[l];
            l++;
            m++;
        }
        for (int i = 0; i < m; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}