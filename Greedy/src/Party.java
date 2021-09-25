import java.util.Arrays;
import java.util.Scanner;

public class Party {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0){
            int n = sc.nextInt();
            int[] ash = new int[n];
            int[] garry = new int[n];

            for(int i = 0; i < n; i++) ash[i] = sc.nextInt();
            for(int i = 0; i < n; i++) garry[i] = sc.nextInt();
            Arrays.sort(ash);
            Arrays.sort(garry);
            boolean flag = true;
            for(int i = 0 ; i < n; i++){
            if(garry[i] >= ash[i]){
                flag = false;
                break;
            }
        }
            if(flag){
                System.out.println("Ash Finally Wins");
            }else{
                System.out.println("Try again");
            }

        }
    }
}
