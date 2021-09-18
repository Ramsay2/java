import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class LowestSumGreaterThanT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(findInt(arr,n,k));
        }
    }

    public static int findInt(int[] arr, int n, int t){
        Arrays.sort(arr);
        int start = 0, end = n - 1;
        ArrayList<Integer> list = new ArrayList<>();
        while (start < end){

            if(arr[start] + arr[end] < t){
                start++;
            }else if(arr[start] + arr[end] > t){
                list.add(arr[start] + arr[end]);

                end--;
            }else {
                start++;
            }

        }
        Collections.sort(list);
        return list.get(0);


    }
}
