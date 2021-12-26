package randomDayOne;

import java.util.Scanner;

public class PrimeNumberMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;
        int temp = n * m;
        while (temp-- != 0) {
            int k = sc.nextInt();
            if(isPrime(k)){
                System.out.print(k + " ");
                count++;
            }
        }
        System.out.println(count);
    }


    public static boolean isPrime(int n) {
        if(n == 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}


