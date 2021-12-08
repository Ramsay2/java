package randomDayOne;

import java.util.Scanner;

public class NikhilAndSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        while (k-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(numbersInRange(arr, a, b));
        }
    }

    private static int numbersInRange(int[] arr, int x, int y) {

     int ans1 = -1;
     int ans2 = -1;
       int start = 0;
       int end = arr.length - 1;
       while (start <= end) {
           int mid = (start + end) / 2;
           if (arr[mid] == y) {
               ans1 = mid;
               break;
           }
           if (arr[mid] < y) {
               start = mid + 1;
           }
           if (arr[mid] > y) {
               ans2 = mid;
               end = mid - 1;
           }

       }
       if(x == 0 && ans1 != -1) {
           return arr.length - ans1;
       }else if(x == 0) {
           return arr.length - ans2;
       }else   if(ans1 != -1) {
           return 0;
       }

        return ans1;
    }
}
