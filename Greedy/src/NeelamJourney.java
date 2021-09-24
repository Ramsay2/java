import java.util.Scanner;

public class NeelamJourney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int current = arr[0];
        int total = 0;
        for (int i = 0; i < n; i++){
            current = Math.min(current,arr[i]);
            total += current;
        }
        System.out.println(total);
    }
}
