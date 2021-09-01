import java.util.Scanner;

public class PatternOfIndexes {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        printPattern(n, arr);

        for(int i = 0 ; i < n; i ++){
            for(int j = 0 ; j < n; j ++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void printPattern(int n, int[][] arr) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    arr[j][i] = j;
                } else {
                    arr[j][i] = i;
                }
            }
        }

    }

}

