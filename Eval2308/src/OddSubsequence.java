import java.util.Scanner;

public class OddSubsequence {

    public static boolean ans = false;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            subsets(arr, 0, new int[0]);
            if(ans){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
            ans = false;
        }
    }

    public static void subsets(int[] input, int i, int[] temp) {
        if (i == input.length) {


            for (int m = 0; m < temp.length; m++) {
                if (temp[0] % 2 == 1 && temp[temp.length - 1] % 2 == 1) {
                    ans = true;
                    break;
                }
            }

            return;
        }

        int[] arr = new int[temp.length + 1];
        int k = 0;
        for (int j : temp) {
            arr[k] = j;
            k++;
        }

        arr[k] = input[i];
        subsets(input, i + 1, arr);
        subsets(input, i + 1, temp);

    }
}

