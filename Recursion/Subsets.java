import java.util.Scanner;

public class Subsets {
    public static boolean flag = false;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int[] a = new int[0];

        printSubsets(arr, 0, a,k);
        if (flag){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }

    }

    public static void printSubsets(int[] input, int start, int[] output, int k) {

        if (start == input.length) {
            int count = 0;

                for (int i = 0; i < output.length; i++) {
                    count += output[i];
                }
                if(count == k){
                    flag = true;

                    return;
                }
            return;

        }

        int[] newArray = new int[output.length + 1];

        int m = 0;

        for (int i = 0; i < output.length; i++) {
            newArray[m] = output[i];
            m++;

        }

        newArray[m] = input[start];
        printSubsets(input, start + 1, newArray,k);

        printSubsets(input, start + 1, output,k);
    }
}