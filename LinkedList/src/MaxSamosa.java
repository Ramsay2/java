import java.util.*;

public class MaxSamosa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int m = -1, count = 0, temp = 0;

        while (m++ != n - 1){
            temp = temp + arr[m];
            if(temp <= k){
                count++;
            }
        }
        System.out.println(count);
    }
}
