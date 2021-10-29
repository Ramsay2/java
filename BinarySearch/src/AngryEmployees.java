import java.util.*;

public class AngryEmployees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i]=sc.nextInt();
            Arrays.sort(arr);
            System.out.println(findDistance(arr,n,m));
        }
    }

    public static int findDistance(int[] arr, int n, int m) {


        int start = 1, end = arr[n - 1];
        int ans = 0;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if(isPossible(arr, mid, m)){
                start = mid + 1;
                ans = Math.max(ans,mid);
            }else {
                end = mid ;
            }
        }
        return ans;
    }

    private static boolean isPossible(int[] arr, int mid, int m) {
        int count = 1;
        int current = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            int distance = arr[i] - current;
            if (distance >= mid) {
                count++;
                current = arr[i];
            }

        }
        return count >= m;
    }
}
