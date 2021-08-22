import java.util.Scanner;

public class Main2 {
    public static boolean flag = false;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int k = sc.nextInt();

        sum(arr, 0, 1, k);
        if(flag){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }

    public static void sum(int[] arr, int n, int m, int k) {

        if (n >= arr.length) {
            return;
        }
        if (m >= arr.length) {
            sum(arr, n + 1, n + 2, k);
            return;
        }
        if (arr[n] + arr[m] == k) {
            flag = true;
            return;
        }
        sum(arr, n, m + 1, k);
    }
}