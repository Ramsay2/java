import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MinCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            ArrayList<Integer> list1 = new ArrayList<>();

            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    if (arr[i] > arr[j] && i != j) {
                        list1.add((arr[i] - arr[j]) * 3);
                    } else if(i != j){
                        list1.add((arr[j] - arr[i]) * 5);
                    }

                }
            }

            Collections.sort(list1);


            int ans = 0;
            for (int i = 0; i < k; i++) {
                ans += list1.get(i);
            }

            System.out.println(ans);
        }
    }
}
