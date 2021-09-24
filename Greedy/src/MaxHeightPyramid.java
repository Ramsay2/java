import java.util.Scanner;

public class MaxHeightPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int k = 0, ans = 0;

        while (k++ != n) {
            if (k * (k + 1) / 2 <= n){
                ans = k;
            }else{
                break;
            }
        }
        System.out.println(ans);

    }
}
