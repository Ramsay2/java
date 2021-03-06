package BinarySearch.src;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        int []a1 = new int[N1];
        for(int i = 0 ; i < N1 ; i++){
            a1[i] = sc.nextInt();
        }
        int[] a2 =new int[N2];
        for(int j = 0 ; j < N2 ; j++){
            a2[j]= sc.nextInt();
        }
        Arrays.sort(a1);
        for(int j = 0 ; j < N2 ; j++){
            if(binarySearch(a1,0,N1-1,a2[j])){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }

    static boolean binarySearch(int[] a, int low, int high, int k){
        if (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] == k){
                return true;
            }
            else if (a[mid] > k){
                return binarySearch(a, low, mid - 1, k);
            }
            else {
                return binarySearch(a, mid + 1, high, k);
            }
        }
        return false;
    }
}