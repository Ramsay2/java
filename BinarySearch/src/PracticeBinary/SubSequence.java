package PracticeBinary;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class SubSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[]{"b","a"};
        Arrays.sort(str);
      for (int i = 0; i < str.length; i++) System.out.print(str[i]);

    }
    static void subSeq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subSeq(ch + p,up.substring(1));
        subSeq(p,up.substring(1));
    }
}
