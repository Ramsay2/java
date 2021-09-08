import java.util.Scanner;

public class WayToSumN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0){
            int n = sc.nextInt();
            int a = 1,b = 3,c = 5 ;
            System.out.println(sum(n,a,b,c));

        }
    }
    public static int sum(int n, int a, int b, int c){

        int sum = 0;
        int count = 0;
        if(sum == n){
            count++;

        }
       sum =  a + sum(n,a,b,c);
        sum =  b + sum(n,a,b,c);
        sum =  c + sum(n,a,b,c);
        return count;


    }
}
