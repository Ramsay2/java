package stacks;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class UseSideLane {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        if (k != 0) {
            Stack<Integer> stack = new Stack<>();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (i + 1 < n && arr[i] > arr[i + 1]) {
                    stack.push(arr[i]);
                } else {
                    list.add(arr[i]);
                }
            }
            boolean flag = true;
            for (int i = 0; i < list.size(); i++) {
                if (i + 1 != list.get(i)) {
                    flag = false;
                    break;
                }
            }
            for (int i = list.size(); i < n; i++) {
                if (stack.pop() != i + 1) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

        }
    }
    }
