import java.util.*;
public class OptimiseTheCurve{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            System.out.println(curve(a,b,c,d));
        }
    }
    public static int curve(int a, int b, int c, int d){


        if(d < c) return -1;
        long start = 0, end = d, ans = -1 ;


        while (start <= end){
            long  mid = start + (end - start)/2;
            long  sum = a*mid*mid + b*mid + c;
            if (sum > d){
                ans = (int) mid;
                end = mid - 1;
            }
            else if (sum < d){
                start = mid + 1;
            }
            else {
                return (int) mid;
            }
        }
        return (int) ans;

    }
}