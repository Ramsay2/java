package randomDayOne;

import java.util.Arrays;
import java.util.Scanner;

public class RepeatedMissing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(findMissing(arr));
        }
    }

    private static String findMissing(int[] arr) {
        String missing = "";
        String repeated = "";
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != i + 1) {
                missing = i + 1 + " ";

            }
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (i + 1 < arr.length && arr[i] == arr[i + 1]) {
                repeated = arr[i] + "";
                break;
            }

        }
        return missing + repeated;
    }
}
