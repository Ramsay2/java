package randomDayOne;

import java.util.Scanner;

public class MatrixNonPrimeCheck {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;
        while(n*m-- != 0){
            if(isPrime(sc.nextInt())){
                count++;
            }
        }
        System.out.println(count);

    }

    public static boolean isPrime(int n){
        for(int i = 2; i <= Math.sqrt(n);i++){
            if(n % i == 0 && n != 2){
                return true;
            }
        }
        return false;

    }
}
