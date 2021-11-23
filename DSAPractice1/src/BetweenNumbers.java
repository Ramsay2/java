import java.util.Scanner;

public class BetweenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n;i++) arr[i] = sc.nextInt();
        int k = sc.nextInt();
        while (k-- != 0){
            int count = 0;
            int l = sc.nextInt();
            int r = sc.nextInt();

            for(int i = 0; i < n; i++){
                if(arr[i] >= l || arr[i] <= r) count++;
            }
            System.out.print(count +" ");
        }
    }
}
