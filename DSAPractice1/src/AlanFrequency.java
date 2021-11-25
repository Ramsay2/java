import java.util.*;


public class AlanFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        String ans = String.valueOf(ch);

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {

            if (map.containsKey(ans.charAt(i))) {
                map.put(ans.charAt(i), map.get(ans.charAt(i)) + 1);
            } else {

                map.put(ans.charAt(i), 1);
            }
        }

        for(Map.Entry<Character,Integer> itr : map.entrySet()){

            System.out.println(itr.getKey()+"-" + itr.getValue());
        }
    }

}
