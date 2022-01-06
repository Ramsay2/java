package randomDayOne;

import java.util.Scanner;

public class NickAndHacks {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            if(n % 20 == 0 || n == 1){
                System.out.println("Yes");
            }else if(n % 10 == 0){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
