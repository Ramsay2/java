package randomDayOne;

import java.util.Scanner;

public class EquilibriumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        System.out.println(findEQ(arr, n, sum));
    }
   static int findEQ(int [] arr, int n, int sum){
       int leftSum = 0;
       int rightSum;
        for(int i = 1; i < n; i++){
            leftSum += arr[i - 1];
            rightSum = sum - leftSum ;
            if(leftSum == rightSum - arr[i]){
                return i + 1;
            }

        }
        return -1;
    }
   }

