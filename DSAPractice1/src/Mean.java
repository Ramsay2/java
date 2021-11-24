import java.util.*;

public class Mean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int sum = 0, count = 1, max = 0, median = 0;
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            Arrays.sort(arr);


            for (int i = 0; i < n; i++) {
                sum += arr[i];
                if (arr[i] == arr[i + 1]) {
                    count++;
                }
            }
            if (n % 2 == 0) {
                median = (arr[n / 2] + arr[n / 2 - 1]) / 2;
            } else median = arr[n / 2];
            System.out.println(sum / n + " " + median + " " + mode(arr,n));
        }
    }

    static int mode(int[] arr, int n) {
        Map<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (mp.containsKey(arr[i])) {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            } else {
                mp.put(arr[i], 1);
            }
        }
        int min = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            for (Map.Entry<Integer, Integer> entry1 : mp.entrySet()) {
            if(entry.getValue() == entry1.getValue()){
                min = Integer.min(entry.getValue(),entry1.getValue());
                break;
            }else  if(entry.getValue() > min){
                min = entry.getKey();
            }
            }

            }
        return min;
        }

    }

