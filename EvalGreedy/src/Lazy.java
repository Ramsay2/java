import java.util.*;


public class Lazy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            Arrays.sort(arr);
            List<Integer> a = new ArrayList<>();
            a.add(1);
            a.add(2);
            a.add(5);
            a.add(10);
            a.add(20);
            a.add(50);
            a.add(100);
            a.add(200);
            a.add(500);
            a.add(2000);
            int min = 100000, ans = 100001;
            boolean flag = false;
            for (int i = 0; i < n; i++) {
                if (a.contains(arr[i])) {
                    System.out.println(arr[i]);
                    flag = true;
                    break;
                } else {
                    int count = 0;
                    int k = arr[i];

                    for (int j = a.size() - 1; j >= 0; j--) {
                        while (k > 0 && k >= a.get(j)) {
                            k -= a.get(j);
                            count++;
                        }

                    }
                    if (min > count) {
                        min = count;
                        ans = arr[i];

                    }

                }
            }
            if (!flag)
                System.out.println(ans);

        }
    }
}
