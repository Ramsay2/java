import java.util.*;
public class EatMango{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int n = sc.nextInt();
            int [] arr = new int[n];
            for(int i = 0; i < n; i ++) arr[i] = sc.nextInt();

            int count = arr[0] + 1;

            for(int i = 1; i < n; i ++){
                if(arr[i] >= arr[i - 1]){
                    count += arr[i] - arr[i - 1] + 2;
                }else{
                    count += arr[i] + arr[i - 1] + 1;
                }
            }
            System.out.println(count);
        }
    }
}