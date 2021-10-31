package PracticeBinary;

import java.util.Scanner;

public class FindInInfinite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findN(n));
    }

    private static int findN(int n) {
        int s = 1, e = 1, ans = 0;
        while (s != n || e != n) {
            int mid = s + (e - s) / 2;
            if (mid == n) return mid;
            if (mid > n) {
                e = mid - 1;
            } else if (e < n) {
                e = e * 2;
            }else {
                s = mid + 1;
            }
        }
        return ans;
    }
}
