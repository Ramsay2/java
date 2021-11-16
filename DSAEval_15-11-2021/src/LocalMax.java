import java.util.Scanner;

public class LocalMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            System.out.println(max(arr,n));

        }
    }
    public static int max(int[] arr, int n){
        if(n == 2) return -1;
        int ans = 0;
        for(int i = 1 ; i < n -1 ;i++){
            if(arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) ans++;
        }
        return ans;
    }
}
