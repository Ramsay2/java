import java.util.Scanner;

public class lift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- != 0) {
            String str = sc.next();
            System.out.println(fun(str));
        }
    }
    public static int fun(String str){
            int count = 1;
            for (int i = 0; i < str.length()- 1; i++) {
                if (str.charAt(i) != str.charAt(i + 1)){
                    count++;
                }
            }
            return count;
        }

    }

