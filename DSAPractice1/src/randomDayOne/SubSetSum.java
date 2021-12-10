package randomDayOne;

import java.util.HashMap;
import java.util.Scanner;

public class SubSetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int sum = sc.nextInt();
        if (isSumAvailable(arr, n, sum))
            System.out.println("yes");
        else
            System.out.println("no");
    }

    static boolean isSumAvailable(int[] set, int n, int sum) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        map.put(set[0], 0);
        map.clear();
        System.out.println(map.size() + "map size");


        if (sum == 0)
            return true;
        if (n == 0)
            return false;


        if (set[n - 1] > sum)
            return isSumAvailable(set, n - 1, sum);

        return isSumAvailable(set, n - 1, sum) || isSumAvailable(set, n - 1, sum - set[n - 1]);
    }
}