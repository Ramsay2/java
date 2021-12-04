import java.util.Scanner;

public class ZeroTOEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int k = 1, j = 0;
     int [] ans = new int[k];
        for(int i = 0;i< arr.length;i++){
            if(arr[i]!=0){
                ans[j]=arr[i];
                j++;
                k++;
            }
        }
        for(int i = 0;i< ans.length;i++){
            System.out.print(ans[i] +" ");
        }
    }
}
