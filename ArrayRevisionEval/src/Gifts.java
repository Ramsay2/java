import java.util.*;


public class Gifts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            int s = 0;
            int p = 0;
            int max = 0;
            Map<Integer, Integer> map = new HashMap<>();

            for(int i = 0; i < n; i++){
                if(map.containsKey(arr[i])){
                    int k = map.get(arr[i]);

                  max = Math.max(max, s);
                  p = Math.max(k,p);
                  s = i - p;


                }else{
                    s++;
                }
                map.put(arr[i], i);

            }

            System.out.println(Math.max(max,s));
        }
    }
    }

