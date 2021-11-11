import java.util.Arrays;
import java.util.Scanner;

public class WhereIFit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String m = sc.nextLine();
        String[] temp = m.split(" ");
        int t = Integer.parseInt(temp[0]);
        while (t-- != 0) {
            String l = sc.nextLine();
            String[] k = l.split(" ");
            String str = sc.nextLine();
            String[] str1 = str.split(" ");
            int[] arr = new int[str1.length];
            for (int i = 0; i < str1.length; i++) {
                arr[i] = Integer.parseInt(str1[i]);
            }
            if (Integer.parseInt(k[0]) < arr[0]) {
                System.out.println("Front " + arr[0]);
            } else if (Integer.parseInt(k[0]) > arr[str1.length - 1]) {
                System.out.println(arr[str1.length - 1] + " Last");
            } else

                System.out.println(lower(arr, Integer.parseInt(k[0])));

        }
    }

    static String lower(int[] arr, int target) {
        Arrays.sort(arr);


        int start = 0, end = arr.length - 1;
        int ans1 = 0, ans2 = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
                ans1 = arr[mid];
            }
            if (arr[mid] >= target) {
                end = mid - 1;
                ans2 = arr[mid];
            }
        }
        return ans1 + " " + ans2;
    }


}


