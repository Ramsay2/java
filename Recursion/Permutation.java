import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        permute(arr, 0, n - 1);
    }


    public static void permute(int[] arr, int l, int r) {
        if (l == r) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
        for (int i = l; i <= r; i++) {
            swap1(arr[l], arr[i]);
            permute(arr, l + 1, r);
            swap1(arr[l], arr[i]);
        }

    }

    private static void swap1(int i, int j) {
        int temp;
        temp = i;
        i = j;
        j = temp;
    }

}