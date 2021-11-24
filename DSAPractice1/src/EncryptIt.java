import java.util.Scanner;

public class EncryptIt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        StringBuilder ans = new StringBuilder();
        char ch1 = 96, ch2 =64;
       // System.out.println(ch1 +" "+ ch2);
        for (int i = 0; i < str.length(); i++) {

            if ((str.charAt(i) >= 97 && str.charAt(i) <= 122)) {
                if (str.charAt(i) + n > 122) {
                    char ch = (char) (97 + ((str.charAt(i) - 97 + n) % 26) );
                    ans.append(ch);
                } else {
                    ans.append((char) (str.charAt(i) + n));
                    
                }
            } else if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                if (str.charAt(i) + n > 90) {
                    char ch = (char)  (65 + ((str.charAt(i) - 65+ n) % 26) );
                    ans.append(ch);
                } else {
                    ans.append((char) (str.charAt(i) + n));
                }

            } else if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                if (str.charAt(i) + n > 57) {
                    char ch = (char) ( (48 +( (str.charAt(i) - 48 + n) % 10) ));
                    ans.append(ch);
                } else {
                    ans.append((char) (str.charAt(i) + n));
                }
            } else ans.append(str.charAt(i));
        }
        System.out.println(ans);
    }
}
