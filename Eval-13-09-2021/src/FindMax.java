import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println(findMax(arr, n));
    }

    private static int findMax(int[] arr, int n) {
        long start = 0, end = n - 1;

        while (start < end) {
            long mid = start + (end - start) / 2;

            if (arr[(int) start] < arr[(int) mid]) {
                start = mid;
            } else if (arr[(int) start] > arr[(int) mid]) {
                end = mid - 1;
            }else{
                start = start + 1;
            }

        }
        return arr[(int) start];
    }
}
