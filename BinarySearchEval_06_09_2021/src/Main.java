import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            String str = sc.next();

            System.out.println(encryption(str, n));
        }
    }
        public static String encryption(String str, int n){
            List<Character> list = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            list.add(str.charAt(i));
        }
            int start = 0, end = n - 1;
            String ans = "";
            while(start <= end){

                int mid = start + (end - start)/2;
                ans += list.get(mid);
                list.remove(mid);
                end--;
            }
            return ans;
        }

}