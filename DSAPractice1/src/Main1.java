import java.util.*;
import java.io.*;

class Main1 {

    public static String ArrayChallenge(int[] arr) {

        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE,
                min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        if(arr.length == 2){
            return Math.max(arr[0] , arr[1]) +" "+ Math.min(arr[0],arr[1]);

        }
        HashSet<Integer> set = new HashSet<>();
        for (int j : arr) set.add(j);

        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()){
            if(itr.next() > max1){
                max2 = max1;
                max1 = itr.next();
            }else if(itr.next() > max2){
                max2 = itr.next();
            }

            if(itr.next() < min1){
                min2 = min1;
                min1 = itr.next();
            }else if(itr.next() < min2){
                min2 = itr.next();
            }

        }

        String str = "asasa asasa asasa asaa";
        String[] arr1 = str.split(" ");
        System.out.println(arr1[1]);
       /* for(int i = 0; i < arr.length; i++){
            if(arr[i] > max1){
                max2 = max1;
                max1 = arr[i];
            }else if(arr[i] > max2){
                max2 = arr[i];
            }

            if(arr[i] < min1){
                min2 = min1;
                min1 = arr[i];
            }else if(arr[i] < min2){
                min2 = arr[i];
            }
        }*/

        return max2 +" " +min2;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);

    }

}