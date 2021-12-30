package randomDayOne;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        String[] str1 = word1.split(", ");

        String[] _word2 = word2.split(" ");
        String[] str2 = Arrays.toString(_word2).split(", ");

        Arrays.sort(str1);
        Arrays.sort(str2);
        System.out.println(Arrays.toString(str1));
        System.out.println(Arrays.toString(str2));
        if(Arrays.toString(str1).equals(Arrays.toString(str2))){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

    }
}
