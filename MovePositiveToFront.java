package Programs;

import java.util.Scanner;

public class MovePositiveToFront {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ar =new int[n];
        for(int i=0;i<ar.length;i++) {
            ar[i]=sc.nextInt();
        }

        movePositiveToFront(ar);

        
        for (int num : ar) {
            System.out.print(num + " ");
        }
    }

    private static void movePositiveToFront(int[] arr) {
        int n = arr.length;
        int positiveIndex = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                int temp = arr[i];
                arr[i] = arr[positiveIndex];
                arr[positiveIndex] = temp;
                positiveIndex++;
            }
        }
    }
}
