import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SeparateEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int q = sc.nextInt();
            ArrayList<Integer> even = new ArrayList<>();
            ArrayList<Integer> odd = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 0) {
                    even.add(arr[i]);

                } else {
                    odd.add(arr[i]);
                }
            }
            Collections.sort(even);
            Collections.sort(odd);
            if (q == 1) {
                for (int value : even) {
                    System.out.print(value + " ");
                }
                for (int j : odd) {
                    System.out.print(j + " ");
                }

            } else {

                for (int j : odd) {
                    System.out.print(j + " ");
                }
                for (int value : even) {
                    System.out.print(value + " ");
                }
            }
            System.out.println();
        }

    }
}
