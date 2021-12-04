package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CodingPracticeTime {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        System.out.println(minHr(arr, m));
    }

    static long minHr(long[] arr, int m) {
        long ans = 0, start = 0, end = (long) Math.pow(10, 14);
        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (isValid(arr, mid, m)) {
                ans = mid;
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return ans;
    }

    static boolean isValid(long[] arr, long mid, int m) {

        long sum = 0, count = 0;

        for (int i = 0; i < arr.length; i++) {
          sum+= arr[i];
           if(sum > mid) {
               count++;
               sum = arr[i];
           }else if(sum == mid) {
               count++;
               sum = arr[i];
           }
           if(count == m) {
               return true;
           }
           if(count > m) {
               return false;
           }
        }
        return false;
    }
}
