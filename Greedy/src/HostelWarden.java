import java.util.Arrays;
import java.util.Scanner;

public class HostelWarden {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] student = new int[n];
        int[] room = new int[n];
        for (int i = 0; i < n; i++) student[i] = sc.nextInt();
        for (int i = 0; i < n; i++) room[i] = sc.nextInt();
        Arrays.sort(student);
        Arrays.sort(room);
        int max = 0;
        for (int i = 0; i < n; i++) {

            if (Math.abs(student[i] - room[i]) > max) {
                max = Math.abs(student[i] - room[i]);
            }

        }
        System.out.println(max);
    }
}
