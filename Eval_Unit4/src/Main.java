import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n ; i++) arr[i] = sc.nextInt();
        boolean flag = false;
        int ans = 0;

        for(int i = 0; i < n ; i++) {
            if(arr[i] == 1){
                flag = true;
                ans = i;
                break;
            }
        }
        if(flag){
            System.out.println(ans);
        }else {
            System.out.println(-1);
        }
        }


    }

