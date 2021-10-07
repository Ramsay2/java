import java.util.Scanner;

public class NationalAwardCeremony {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            for (int i = 0; i < n; i++) {
                if (arr[i] == 0)
                    System.out.print(arr[i] + " ");
            }
            for (int i = 0; i < n; i++) {
                if (arr[i] == 1)
                    System.out.print(arr[i] + " ");
            }
            for (int i = 0; i < n; i++) {
                if (arr[i] == 2)
                    System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
