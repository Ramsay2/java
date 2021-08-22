import java.util.Scanner;

class Main {

    public static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        nQueen(arr, 0);
        System.out.println(count);
    }

    public static boolean isQueenSafe(int[][] arr, int row, int col) {
        for (int i = row - 1; i >= 0; i--) {
            if (arr[i][col] == 1) {
                return false;
            }
        }

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (arr[i][j] == 1) {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < arr.length; i--, j++) {
            if (arr[i][j] == 1) {
                return false;
            }
        }
        return true;
    }

    public static void nQueen(int[][] arr, int row) {

        if (row >= arr.length) {
            count++;
            return;
        }

        for (int col = 0; col < arr.length; col++) {
            if (isQueenSafe(arr, row, col)) {
                arr[row][col] = 1;
                nQueen(arr, row + 1);
                arr[row][col] = 0;
            }
        }
    }
}