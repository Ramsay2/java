import java.util.Scanner;

public class MinimumPlateform {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arrival = new String[n];
        String[] dep = new String[n];
        for (int i = 0; i < n; i++) arrival[i] = sc.next();
        for (int i = 0; i < n; i++) dep[i] = sc.next();

        int[] arr = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            arrival[i] = arrival[i].replace(':', '0');
            arr[i] = Integer.parseInt(arrival[i]);

            dep[i] = dep[i].replace(':', '0');
            arr2[i] = Integer.parseInt(dep[i]);

        }
        int count, ans = 1;
        for (int i = 0; i < n; i++) {
            count = 1;
            for (int j = i + 1; j < n; j++) {

                if ((arr[i] >= arr[j] && arr[i] <= arr2[j]) || (arr[j] >= arr[i] && arr[j] <= arr2[i])) {
                    count++;
                }
            }
            ans = Math.max(ans, count);

        }
        System.out.println(ans);

    }


}

