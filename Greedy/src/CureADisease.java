import java.util.Arrays;
import java.util.Scanner;

public class CureADisease {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] vac = new int[n];
        int[] per = new int[n];
        for (int i = 0; i < n; i++) vac[i] = sc.nextInt();
        for (int i = 0; i < n; i++) per[i] = sc.nextInt();
        Arrays.sort(vac);
        Arrays.sort(per);
        int i = n - 1;
        boolean flag = true;
        while(i-- != 0) {
            if (vac[i] < per[i]) {
               flag = false;
               break;
            }
        }
        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
