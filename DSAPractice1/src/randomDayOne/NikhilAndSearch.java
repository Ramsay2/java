package randomDayOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class NikhilAndSearch {
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
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        while (k-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(numbersInRange(arr, a, b));
        }
    }

    private static int numbersInRange(int[] arr, int x, int y) {
        Arrays.sort(arr);
        int ans = -1;
        int start = 0, end = arr.length - 1;
        if (x == 0) {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] == y) {
                    ans = arr.length - mid;
                    end = mid - 1;
                }
                if (arr[mid] < y) {
                    start = mid + 1;
                } else {
                    ans = arr.length - mid;
                    end = mid - 1;
                }
            }
            if (ans == -1) {
                return 0;
            }
            return ans;

        } else if (x == 1) {
            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (arr[mid] <= y) {
                    start = mid + 1;
                } else {
                    ans = arr.length - mid;
                    end = mid - 1;
                }
            }
        }
        if (ans == -1) {
            return 0;
        }
        return ans;
    }
}
