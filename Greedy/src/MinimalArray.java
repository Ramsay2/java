import java.util.Scanner;

public class MinimalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            for (int i = 0; i < n; i++) {
                int m = i;
                for (int j = i + 1; j < n ; j++) {
                    if (j <= i + k){
                        if (arr[m] > arr[j]) {
                            m = j;
                        }
                }
                }
                    int temp = arr[m];

                    while (m != i) {
                        arr[m] = arr[m - 1];
                        k--;
                        m--;
                    }
                    arr[m] = temp;

            }
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] +" ");
            }
        }
    }
}
