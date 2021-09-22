import java.util.Arrays;
import java.util.Scanner;

public class MinCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            Arrays.sort(arr);
            int[] arr2 = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                arr2[i] = Math.abs(arr[i] - arr[i + 1]);
            }
            Arrays.sort(arr2);
            int count = 0;
            for (int i = 0; i < n - 1; i++) {
                if (arr2[i] != 0) {
                    count += k * 3;
                }else if(arr2[i] == 0){
                    count+=2;
                    break;
                }
            }
            System.out.println(count);
        }
    }
}
