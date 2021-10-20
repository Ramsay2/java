import java.util.Scanner;

public class SudokuSolver {
    public static boolean flag = true;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        solve(arr, 0, 0);
        if(flag){
            System.out.println(-1);
        }
    }

    public static boolean isPossible(int[][] arr, int row, int col, int number) {

        for (int j = 0; j < arr.length; j++) {
            if (arr[row][j] == number) return false;

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][col] == number) return false;
        }
        int bi = (row / 3) * 3;
        int bj = (col / 3) * 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[bi + i][bj + j] == number) return false;
            }
        }

        return true;
    }

    public static void solve(int[][] arr, int i, int j) {

        if (i == arr.length) {
            for (int k = 0; k < 9; k++) {
                for (int m = 0; m < 9; m++) {
                    System.out.print(arr[k][m] + " ");
                }
                System.out.println();
            }
            flag = false;
            return;
        }

        int ni, nj;
        if (j == arr[0].length - 1) {
            nj = 0;
            ni = i + 1;
        } else {
            ni = i;
            nj = j + 1;
        }
        if (arr[i][j] != 0) {
            solve(arr, ni, nj);
        } else {
            for (int num = 1; num < 10; num++) {
                if (isPossible(arr, i, j, num)) {
                    arr[i][j] = num;
                    solve(arr, ni, nj);
                    arr[i][j] = 0;
                }

            }
        }
    }

}