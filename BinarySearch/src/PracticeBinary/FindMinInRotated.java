package PracticeBinary;
import java.util.Scanner;
public class FindMinInRotated {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(findMin(arr));
    }

    public static int findMin(int[] arr) {
        int n = arr.length, s = 0, e = n - 1;
        if(arr[s] < arr[e]) return arr[s];

        while (s < e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] > arr[e]) {
                s = mid + 1;
            } else  if (arr[mid] < arr[e]) {
                e = mid ;

            }else {
                e--;

            }
        }
        return arr[e];
    }
}
