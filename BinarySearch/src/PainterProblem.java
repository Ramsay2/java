import java.util.Scanner;

public class PainterProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0){
            int n = sc.nextInt(), m = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

            System.out.println(minTime(arr,n,m));
        }
    }
    public static int minTime(int[] arr, int n, int m){
        int max  = 0;
        if(n <= m){
            for(int i = 0; i < n; i++){
                if(arr[i] > max) max = arr[i];
            }
        }else if(n == 1){
            for(int i = 0; i < n; i++){
             max += arr[i];
            }
        }
        return max;
    }
}
