package Programs;

import java.util.Arrays;
import java.util.Scanner;

public class PairsOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }

        pairs(ar);
    }

    private static void pairs(int[] ar) {
      Arrays.sort(ar);
        int count = 0;

        for (int i = 0; i < ar.length - 1; i++) {
            if (ar[i] == ar[i + 1]) {
                count++;
                i++; 
            }
        }

        System.out.println(count);
    }
}
