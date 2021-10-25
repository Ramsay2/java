import java.util.Scanner;

public class NSG_Product {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            nextMax(arr,n);
        }
    }

    public static void nextMax(int[] arr,  int n) {
        int ans = 1;
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = i + 1; j < n; j++) {

                if (arr[j] > arr[i]) {
                    ans *= nextMin(arr,j,n);
                    flag = true;
                    break;
                }
            }
            if(!flag) ans *= -1;

        }
        System.out.println(ans);

    }

    public static int nextMin(int[] arr, int k, int n) {

            for (int i = k + 1; i < n; i++) {
                    if (arr[i] < arr[k]) {
                        return  arr[i];
                    }
        }
        return -1;

    }
}
