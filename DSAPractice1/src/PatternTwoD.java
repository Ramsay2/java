import java.util.Scanner;

public class PatternTwoD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        patternPrint(n, m);
    }

    static void patternPrint(int n, int m) {
        int[][] arr = new int[n][m];
        int rowMin = 0, rowMax = n - 1;
        int colMin = 0, colMax = m - 1;
        int count = 1;


            for (int i = 0; i < m; i++) {
                for (int j = n - 1, k = i; k >= 0 && j >= 0; k--, j--) {
                    arr[j][k] = count;
                    count++;
                }
            }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }

    }
}
