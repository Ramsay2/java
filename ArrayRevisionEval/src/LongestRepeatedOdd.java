import java.util.Scanner;

public class LongestRepeatedOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int count = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int k = arr[i];
            if (k % 2 == 1) {
                while (i < n && k == arr[i]) {
                    count++;
                    i++;
                }

            }
                if (max < count) {
                    max = count;
                }
                count = 0;

        }
        System.out.println(max);
    }
}
