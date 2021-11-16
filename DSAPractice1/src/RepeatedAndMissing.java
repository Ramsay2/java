import java.util.Scanner;

public class RepeatedAndMissing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            System.out.println(missing(arr,n));
        }
    }
    static String missing(int[] arr, int n){
       String ans = "-1";
        for(int i = 0;i <n/2;i++){

            if(arr[i] == arr[i+ 1] ){
                ans = n +" " + arr[i];
                break;
            }
            if( arr[n - 1 - i] == arr[n-2-i]){
                ans = n +" " + arr[n - 1 - i];
                break;
            }
        }
        return ans;
    }
}
