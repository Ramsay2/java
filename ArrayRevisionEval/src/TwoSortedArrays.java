import java.util.*;


public class TwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0){
            int n = sc.nextInt();
            int[] arr1 = new int[n];
            int[] arr2 = new int[n];
            for(int i = 0 ; i < n; i++) arr1[i] = sc.nextInt();
            for(int i = 0 ; i < n; i++) arr2[i] = sc.nextInt();

            int i = 0;
            int j = 0;
            int count = 0;
            while (i != n - 1 && j != n - 1){
                if(arr1[i] == arr2[n- j -1]){
                    count++;
                    i++;
                    j++;
                }else if(arr1[i] < arr2[n - 1 -j]){
                    i++;
                }else{
                    j++;
                }

            }
            System.out.println(count);
        }
    }
}
