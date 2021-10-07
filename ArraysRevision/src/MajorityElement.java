import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
            TreeMap<Integer,Integer> map = new TreeMap<>();
            for(int i = 0 ; i < n; i++){
                if(map.containsKey(arr[i])){
                    map.put(arr[i], map.get(arr[i])+1);
                }else{
                    map.put(arr[i],1);
                }
            }
            boolean flag = false;
            for(Map.Entry<Integer,Integer> itr: map.entrySet()){
                if(itr.getValue() > n / 2){
                    flag = true;
                    System.out.println(itr.getKey());
                    break;
                }

            }
            if(!flag)
                System.out.println(-1);
        }
    }
}
