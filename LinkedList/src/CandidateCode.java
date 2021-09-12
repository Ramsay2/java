import java.util.*;

public class CandidateCode {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            System.out.println(games(n));
        }
    }

    static int games(int n) {
        int ans = 0;

        while (n != 0) {
            ans += n / 2;
            if (n % 2 != 0 && n != 1) {
                n /= 2;
                n = n + 1;
            } else {
                n /= 2;
            }

        }
        return ans;
    }

}