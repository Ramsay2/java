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
      //  Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0){
            int n = sc.nextInt();
            String[] strArr = new String[n];
            int count = 0;
            for(int i = 0; i < n; i++) strArr[i] = sc.next();
            HashSet<String> set = new HashSet<>();
          for(int i = 0; i < n; i++) {
              char[] arr = strArr[i].toCharArray();
              Arrays.sort(arr);
              if(set.contains(Arrays.toString(arr))){
                  count++;
              }else
              set.add(Arrays.toString(arr));

          }

            System.out.println(count);
        }
    }

}
