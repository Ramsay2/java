package randomDayOne;

import java.util.Scanner;

public class BinaryMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(sc.nextInt() == 1) {
                    System.out.print(0 + " ");
                }
                else {
                    System.out.print(1 + " ");
                }
            }
            System.out.println();
        }

    }
}
