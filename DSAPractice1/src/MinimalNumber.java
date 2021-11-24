
import java.util.*;

public class MinimalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            Arrays.sort(arr);
            String temp = "";
            String count = "";
            for (int i = 0; i < n; i++) {
                if (arr[i] == 0)
                    count += "0";
                else temp += arr[i];
            }
            StringBuilder ans = new StringBuilder(temp);
            ans.insert(1, count);
            System.out.println(ans);


        }
    }
}
