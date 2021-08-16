import java.util.Scanner;

public class Famous_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int k = sc.nextInt();
        int ans = solve(str);
        ans = ans * k;
        System.out.println(solve(String.valueOf(ans)));
    }

    private static int solve(String str) {
        if (str.length() == 0) return 0;
        else if (str.length() == 1) return Integer.parseInt(str);
        int temp = 0;
        for (int i = 0; i < str.length(); i++) {
            temp += Character.getNumericValue(str.charAt(i));
        }
        return solve(String.valueOf(temp));
    }
}