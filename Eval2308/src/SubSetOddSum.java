import java.util.Scanner;

public class SubSetOddSum {

    public static int ans = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            subsets(arr, 0, new int[0]);
            System.out.println(ans);
            ans = 0;
        }
    }

    public static void subsets(int[] input, int i, int[] temp) {
        if (i == input.length) {
            int count = 0;

            for (int m = 0; m < temp.length; m++) {
                count += temp[m];
            }
            if (count % 2 == 1) {
                ans++;
            }
            return;
        }

        int[] arr = new int[temp.length + 1];
        int k = 0;
        for (int j : temp) {
            arr[k] = j;
            k++;
        }

        arr[k] = input[i];
        subsets(input, i + 1, arr);
        subsets(input, i + 1, temp);

    }
}

