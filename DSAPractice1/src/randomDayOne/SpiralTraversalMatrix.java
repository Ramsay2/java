package randomDayOne;

import java.util.Scanner;

public class SpiralTraversalMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        spiralTraversal(matrix,n);

    }

    static void spiralTraversal(int[][] arr, int n) {

        //print spiral traversal
        int rowStart = 0;
        int rowEnd = arr.length - 1;
        int colStart = 0;
        int colEnd = arr[0].length - 1;
        while (rowStart <= rowEnd && colStart <= colEnd) {
            //print right column
            for (int i = rowStart; i <= rowEnd; i++) {
                System.out.print(arr[i][colEnd] + " ");
            }
            colEnd--;
            //print bottom row
            if (rowStart <= rowEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    System.out.print(arr[rowEnd][i] + " ");
                }
                rowEnd--;
            }
            //print left column
            if (colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    System.out.print(arr[i][colStart] + " ");
                }
                colStart++;
            }
            //print top row
            for (int i = colStart; i <= colEnd; i++) {
                System.out.print(arr[rowStart][i] + " ");
            }
            rowStart++;


        }
    }

}
