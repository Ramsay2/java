package randomDayOne;

import java.util.Arrays;
import java.util.Scanner;

public class PartyOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int r = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(partyOrNot(c, r, arr));
    }
    static String partyOrNot(int c, int r, int[] arr) {
        Arrays.sort(arr);
        for(int i = 0; i < c; i++) {
            r = r - arr[i];
        }
        if(r >= 0) {
            return "Party";
        }
        return "Sad";
    }
}
