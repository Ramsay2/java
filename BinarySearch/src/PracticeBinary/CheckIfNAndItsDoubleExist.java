package PracticeBinary;

import java.util.Arrays;
import java.util.Scanner;

public class CheckIfNAndItsDoubleExist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(checkIfExist(arr));
    }

    public static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);

        int k = 0;
        while (k != arr.length) {
            int s = k + 1, e = arr.length - 1;
            int temp = arr[k];

            if (temp < 0 && temp % 2 == 0) {
                while (s <= e) {
                    int mid = s + (e - s) / 2;
                    if (arr[mid] == temp / 2) return true;
                    if (arr[mid] > temp / 2) {
                        e = mid - 1;
                    } else {
                        s = mid + 1;
                    }
                }
            }else{
                    while (s <= e) {
                        int mid = s + (e - s) / 2;
                        if (arr[mid] == temp * 2 ) return true;
                        if (arr[mid] > temp * 2) {
                            e = mid - 1;
                        } else {
                            s = mid + 1;
                        }
                    }
                }
            k++;
            }

        return false;
        }
        /*
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                    if(arr[i] == 2*arr[j]){
                        return true;
                    }
                }
            }
        }
        return false;
    }
        */
}
