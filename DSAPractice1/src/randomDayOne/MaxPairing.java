package randomDayOne;

import java.util.*;

public class MaxPairing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

        }
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        System.out.println(maxPair(a, b, n, m));

    }

    static int maxPair(int[] a, int[] b, int n, int m) {

        ArrayList<Integer> al = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<n;i++){
            al.add(a[i]);
        }
        for (int i = 0; i < n; i++) {
            al.add(a[i]);
        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            if (al.contains(b[i] - 1) || al.contains(b[i] + 1)) {
                count++;
            }


        }
        return count;
    }
}
