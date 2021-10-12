import java.util.Scanner;

public class MaxContiguousSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- != 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

            int max = Integer.MIN_VALUE , max_ending = 0;

            for(int i = 0; i < n; i++){
                max_ending += arr[i];
                if(max < max_ending){
                    max = max_ending;
                }
                if(max_ending < 0){
                    max_ending = 0;
                }
            }
            System.out.println(max);
        }
    }
}
