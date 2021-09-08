//https://oj.masaischool.com/contest/1827/problem/3
//Mr.Robot needs an encryption method

import java.util.Scanner;

public class EncryptionMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            String str = sc.next();
            char[] arr = new char[n];
            for (int i = 0; i < n; i++) {
                arr[i] = str.charAt(i);
            }
            System.out.println(encryption(arr, 0, n));
        }
    }

    public static String encryption(char[] str, int start, int end) {

        end = str.length - 1;
        if (start > end) {
            return "";
        }

        String ans = "";
        int mid = start + (end - start) / 2;
        ans = str[mid] + encryption(str, 0, mid - 1) + encryption(str, mid + 1, end);


        return ans;
    }

}
