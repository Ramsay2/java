
import java.util.*;

public class ThreeMinThreeMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // HashSet<Integer> set = new HashSet<>();
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < n; i++) set.add(sc.nextInt());
        //System.out.println(set);
        int count = 0;
        int k = set.size();
        if(k < 3){
            System.out.println("Not Possible");
            System.out.println("Not Possible");
        }else {
            for (int i : set) {
                if (count == 3) break;
                System.out.print(i + " ");
                count++;
            }
            System.out.println();

            for (int i : set) {
                if (k <= 3) {
                    System.out.print(i + " ");
                }
                k--;
            }

        }
    }
}
