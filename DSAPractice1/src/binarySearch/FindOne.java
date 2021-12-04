package binarySearch;

import java.util.Scanner;
public class FindOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findOne(arr, n));
    }
    static int findOne(int[] arr , int n){
        int start = 0;
        int end = n - 1;
        int ans = -1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == 1){
                ans = mid;
                end = mid - 1;
            }
            else if(arr[mid] == 0){
                start = mid + 1;
            }

        }
        return ans;
    }
}
