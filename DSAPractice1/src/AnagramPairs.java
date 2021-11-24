import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class AnagramPairs {
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
        int t = sc.nextInt();
        while (t-- != 0){
            int n = sc.nextInt();
            int count = 0;
               // System.out.println(temp);
                HashMap<String, Integer> map = new HashMap<>();
                for (int i = 0; i < n; i++) {
                    String str = sc.next();
                    char[] arr = str.toCharArray();
                    Arrays.sort(arr);
                    String temp = String.valueOf(arr);

                    if (map.containsKey(temp)) {
                        map.put(temp, map.get(temp) + 1);
                    } else {
                        map.put(temp, 1);
                    }
                }

                for (Map.Entry<String, Integer> itr : map.entrySet()) {
                    if (itr.getValue() > 1) {
                        count += (itr.getValue() * (itr.getValue() - 1) / 2);
                    }
                }


            System.out.println((count));
        }
    }

}
