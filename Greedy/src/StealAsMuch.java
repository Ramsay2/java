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
        ;
        TreeMap<Integer, int[]> map = new TreeMap<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            map.put(value[i] / weight[i], new int[]{value[i], weight[i]});
        }
        int max = 0;
        for (Map.Entry<Integer, int[]> itr : map.entrySet()) {
            System.out.println(itr.getKey() + " " + itr.getValue()[0] + " " + itr.getValue()[1]);
         /*   if(w >= itr.getValue()[1]){
                max += itr.getValue()[0];
                w-= itr.getValue()[1];
            }else {
                max = (int) (max + itr.getValue()[0] *((float)w / itr.getValue()[1]));
                break;
            }*/
        }
        System.out.println(max);
       /* for (int i = 0; i < n; i++) {
            for (int j = i; j <= n - i - 2; j++) {
                if (value[j] / weight[i] < value[j + 1] / weight[j + 1]) {
                    swap(value[j], value[j + 1]);
                    swap(weight[j], weight[j + 1]);
                }
            }
        }


        for (int i = 0; i < n; i++) {
            if (weight[i] <= w) {
                max += value[i];
                w -= weight[i];
            } else {
                max = (int) (max + value[i] * ((float) w / weight[i]));
                break;
            }
        }*/

    }

    public static void swap(int x, int y) {
        int k = x;
        x = y;
        y = k;

    }
}
