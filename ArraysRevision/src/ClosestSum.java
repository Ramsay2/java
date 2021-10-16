import java.util.Scanner;

public class ClosestSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while (t-- != 0){
            int n = sc.nextInt();
            int target = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ; i < n; i++) arr[i] = sc.nextInt();
            int sum = 0;
            int min = Integer.MIN_VALUE;
            for(int i = 0 ; i < 2; i++){
                sum+= arr[i];
            }






        }
    }
}
