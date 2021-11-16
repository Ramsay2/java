import java.util.Scanner;
import java.util.Stack;

public class Ordering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) arr1[i] = sc.nextInt();
        for (int i = 0; i < n; i++) arr2[i] = sc.nextInt();


        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(arr2[i] == arr1[j]){
                    ans++;
                    arr1[j] = -1;
                    break;
                }
                if(arr1[j] != -1)
                ans++;

            }

        }
        System.out.println(ans);
    }
}
