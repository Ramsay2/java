import java.util.Scanner;

public class PosOrNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n == 0){
            System.out.println(0);
        }else if(n < 1 ){
            System.out.println("negative small");
        }else if(n > 1000000){
            System.out.println("positive large");
        }else{
            System.out.println("positive");
        }

    }
}
