package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CountTriplets {

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
        long k = sc.nextLong();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(countTriplets(arr, k, n));
    }

    private static long countTriplets(long[] arr, long k, int n) {

        long count = 0;

        for (int i = 0; i < n; i++) {
            int temp = 0;
            int start = 0;
            int end = n - 1;
            while ( start <= end) {
                int mid = start + ( end - start) / 2;
                if (arr[mid] - arr[i] > k) {
                    end = mid - 1;

                }
                else {
                    start = mid + 1;
                    temp = mid;
                }

            }
            System.out.println(temp);
            if( temp - i >= 2 &&  arr[temp] - arr[i] <= k) {
                count += (long) (temp - i - 1) * (temp - i) / 2;
            }

        }
        return  count;
    }
}
