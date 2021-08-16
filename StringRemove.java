import java.util.Scanner;

public class StringRemove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t -- != 0) {
            String str = sc.next();
            if(fun(str).isEmpty()){
                System.out.println("Empty String");
            }else{
                System.out.println(fun(str));
            }
        }
    }

    public static String fun(String str) {
        if (str.trim().isEmpty()) return str;
        if (str.length() == 1) return str;
        String result = "";
        for (int i = 0; i < str.length() ; i++) {
            if(i == 0) {
                if (str.charAt(i) != str.charAt(i + 1)) {
                    result = result + str.charAt(i);
                }
            }

            if (i == str.length() - 1) {
                if (str.charAt(i) != str.charAt(i - 1))
                    result = result + str.charAt(i);
            } else if(i > 0) {
                if (str.charAt(i) != str.charAt(i - 1) && str.charAt(i) != str.charAt(i + 1)) {
                    result = result + str.charAt(i);
                }
            }
            if (str.length() == result.length()) {
                return result;
            }
        }
        return fun(result);
    }
}