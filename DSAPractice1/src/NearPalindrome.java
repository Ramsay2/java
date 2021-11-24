import java.util.Scanner;

public class NearPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String str = sc.next();
            int count = 0;
            for (int i = 0; i < n; i++) {
                if(str.charAt(i) != str.charAt(n - i)){
                count++;
                }
            }
            if(count > k){
                System.out.println("False");
            }else{
                System.out.println("True");
            }
        }
    }
}
