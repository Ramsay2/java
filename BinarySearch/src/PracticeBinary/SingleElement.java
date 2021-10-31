package PracticeBinary;

import java.util.Scanner;

public class SingleElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println(findN(arr));
    }

    private static int findN(int[] arr) {
        int s = 0, e = arr.length - 1;
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (mid % 2 == 0) {
                if (mid + 1 <= e && arr[mid] == arr[mid + 1]) {
                    s = mid + 2;
                } else if (mid + 1 <= e && arr[mid] != arr[mid + 1]) {
                    return arr[mid];
                } else {
                    e = mid;
                }
            } else {
                if (mid - 1 >= s && arr[mid] == arr[mid - 1]) {
                    s = mid + 1;
                } else if (mid - 1 <= s && arr[mid] != arr[mid - 1]) {
                    return arr[mid];
                } else {
                    e = mid - 1;
                }
            }
        }
        return 1;
    }

}

