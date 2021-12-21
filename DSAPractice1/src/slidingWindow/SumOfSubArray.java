package slidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class SumOfSubArray {
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
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        while (t-- != 0) {
            int n = fr.nextInt();
            long k = fr.nextLong();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = fr.nextLong();
            }
            if (sumOfSubArray(arr, k)) {
                System.out.println("Yes");
            }
            else {
                System.out.println("N0");
            }

        }
    }

    private static boolean sumOfSubArray(long[] arr, long k) {

        Map<Long, Long> map = new HashMap<>();
        map.put((long)0,(long)1);
        long sum = 0;
        for(long x : arr){
            sum += x;
            if(map.containsKey(sum - k)){
               return true;
            }
            map.put(sum, map.getOrDefault(sum,(long)0) + 1);
        }
        return false;
    }

    }

