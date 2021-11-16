import java.util.*;

public class FindNegativePositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            System.out.println(findN(arr,n));
        }

    }
    static int findN(int[] arr, int n){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            if(arr[i] < 0)
                set.add(arr[i]);
        }
        int max = -1;
        for(int i = 0; i < n; i++){

            if(set.contains(-arr[i]) && max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
