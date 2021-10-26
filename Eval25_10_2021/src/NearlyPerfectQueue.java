import java.util.Scanner;

public class NearlyPerfectQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            findN(arr, m , 0, n - 1);
        }

    }

    public static void findN(int[] arr, int m , int start, int end) {

        boolean flag = false;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] == m){
                System.out.println(mid);
                flag = true;
                break;
            }
            if( mid < end &&  arr[mid + 1] == m)  {
                System.out.println(mid + 1);
                flag = true;
                break;
            }
            if(mid > start &&  arr[mid - 1] == m ){
                System.out.println(mid - 1);
                flag = true;
                break;
            }

            if(arr[mid] > m) end = mid - 2;
            else start = mid + 2;

       /*     if(arr[mid] < arr[mid - 1]){
                if(arr[mid - 1] < m){
                    start = mid;
                }else if(arr[mid - 1] > m){
                    end = mid;
                }else if(arr[mid - 1] == m){
                    System.out.println(mid - 1);
                    flag = true;
                    break;
                }
            }else{
                if(arr[mid] < m){
                    start = mid + 1;
                }else if(arr[mid] > m){
                    end = mid - 1;
                }else if(arr[mid] == m){
                    System.out.println(mid);
                    flag = true;
                    break;
                }

            }*/


        }
        if(!flag){
            System.out.println("Not Found");
        }
    }
}
