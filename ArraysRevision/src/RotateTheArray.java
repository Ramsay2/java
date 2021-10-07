import java.util.Scanner;

public class RotateTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            int k = m % n;
            if (k == 0) {
                for (int i = 0; i < n; i++)
                    System.out.print(arr[i] + " ");
            } else {
                for(int i = n - k; i < n; i++){
                    System.out.print(arr[i] + " ");
                } for(int i = 0; i < n - k; i++){
                    System.out.print(arr[i] + " ");
                }

            }
            System.out.println();
        }
    }
}
