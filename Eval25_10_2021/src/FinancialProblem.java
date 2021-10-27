import java.util.Scanner;

public class FinancialProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            int[] ans = new int[n];
            int k =0;
            for (int i = n - 1; i >= 0; i--) {
                int count = 1;
                for (int j = i - 1; j >= 0; j--) {
                    if (arr[j] < arr[i]) {
                        count++;
                    } else break;
                }
                ans[k] = count;
                k++;
            }
            for (int i = n - 1; i >= 0; i--){
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
