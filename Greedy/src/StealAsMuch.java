import java.util.Arrays;
import java.util.Scanner;

public class StealAsMuch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int n = sc.nextInt();
        int[] value = new int[n];
        int[] weight = new int[n];
        for (int i = 0; i < n; i++) {
            value[i] = sc.nextInt();

        }
        for (int i = 0; i < n; i++) {
            weight[i] = sc.nextInt();

        }
        Arrays.sort(value);
        Arrays.sort(weight);
        int ans = 0;
        int[] arr = new int[n];
        int[] arrValue = new int[n];
        int[] arrWeight = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = value[i] / weight[i];
            arrWeight[i] = weight[i];
            arrValue[i] = value[i];

        }
        Arrays.sort(arr);


        for (int i = n - 1; i > 0; i--) {
            if (w > 0 && weight[i] <= w) {
                w = w - weight[i];
                ans += value[i];
            } else {
                break;
            }
            if (w > 0) {
                ans += arr[i] * (w / weight[i]);
            }
        }


        System.out.println(ans);
    }

}
