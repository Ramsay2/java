import java.util.Arrays;
import java.util.Scanner;

public class PartyOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), c = sc.nextInt(), r = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int ans = 0;
        for (int i = 0; i < c ; i++) {

           ans += arr[i];
        }

        if (ans <= r) {
            System.out.println("Party");
        } else {
            System.out.println("Sad");
        }

    }
}
