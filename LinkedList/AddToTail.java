package LinkedList;

import java.util.Scanner;

public class AddToTail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
        String temp = "";
        for(int i = 0 ; i < n; i ++){
            temp += arr[i] +" ";
            System.out.println(temp);
        }
    }
}
