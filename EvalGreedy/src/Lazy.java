import java.util.Scanner;

public class Lazy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            int[] a = {1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};
            int min = 100000, amt = 100000;

            for (int i = 0; i < n; i++) {
                int count = 0;
                int ans = 0;
                for (int j = a.length - 1; j >= 0; j--) {
                    int k = arr[i];
                    while (k >= a[j]) {
                        if(k == a[j]){
                            amt = a[j];
                            break;
                        }
                        k -= a[j];
                        count++;
                    }
                }

                if (min > count ) {
                    min = count;
                    //amt = arr[i];
                }
            }
            System.out.println(min);
        }
    }
}
