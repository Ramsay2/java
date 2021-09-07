import java.util.Arrays;
import java.util.Scanner;

public class DiscoverNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] arr2 =new int[k];
        for(int i = 0 ; i < k ; i++){
            arr2[i]= sc.nextInt();
        }
       for(int i = 0 ; i < k ; i ++){
           discover(arr,arr2[i]);
       }
    }

    public static void discover(int[] arr, int target) {
        Arrays.sort(arr);
        int start = 0, end = arr.length - 1;
        if(target >= arr[0] && target <= arr[arr.length - 1]) {
            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (arr[mid] == target) {
                    System.out.println("YES");
                    return;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        System.out.println("NO");
    }
}
