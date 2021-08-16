import java.util.Scanner;

public class Subsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        subsets(n);
    }
    public static void  subsets(int n){
        if(n == 0){
            System.out.println(n);
            return;
        }
        subsets(n-1);
    }
}
