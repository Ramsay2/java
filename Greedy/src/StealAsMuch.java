import java.util.*;

public class StealAsMuch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int n = sc.nextInt();
        int[] value = new int[n];
        int[] weight = new int[n];
        for (int i = 0; i < n; i++) {
            value[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            weight[i] = sc.nextInt();

        }

        int ans = 0;
        float[] arr = new float[n];
        Map<Float, int[]> map = new TreeMap<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            arr[i] = ((float) value[i] / (float) weight[i]);
            map.put(arr[i], new int[]{value[i], weight[i]});

        }


        for (Map.Entry<Float, int[]> itr : map.entrySet()) {

            if (w > 0 && itr.getValue()[1] <= w) {
                w = w - itr.getValue()[1];
                ans += itr.getValue()[0];
            } else {
                ans += itr.getKey() * (w);
                break;
            }


        }



        System.out.println(ans);
    }

}
