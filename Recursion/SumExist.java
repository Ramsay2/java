import java.util.Scanner;

public class SumExist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(isSumExist(arr, 2, m));
    }
    public static int isSumExist(int[] arr, int n, int m){
        if (n == arr.length) {
            return arr[n - 1];
        }

        return isSumExist(arr, n + 1, m) + arr[n];
    }
}
