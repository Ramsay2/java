import java.util.Scanner;

public class Log {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.printf("%.4f", fun(n));
    }
    public static double fun(int n){

        if(n == 0){
            return 0;
        }
        return fun(n - 1) + Math.log(n);
    }
    public static void print(double n){

        String str = String.valueOf(n);
        String temp = "";

        for(int i = 0; i < str.length() - 1; i++){
            if(str.charAt(i)=='.'){
                temp+= str.charAt(i+1);
            }

        }
    }
}
