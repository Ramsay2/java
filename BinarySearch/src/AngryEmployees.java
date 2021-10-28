import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AngryEmployees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) arr.add(sc.nextInt());

        }
    }

    public static int findDistance(ArrayList<Integer> arr, int n, int m) {

        Collections.sort(arr);
        int start = 0, end = arr.get(n - 1) / m;
        int ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            isPossible(arr, mid);
        }
        return ans;
    }

    private static boolean isPossible(ArrayList<Integer> arr, int mid) {

        for (int i = 0; i < arr.size() - 1; i++) {
            if (!arr.contains(arr.get(i)))
                return false;
        }
        return true;
    }
}
