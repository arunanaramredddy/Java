package Programs;

import java.util.Scanner;

public class InsertionSort {
	public static void insertionSort(int[] ar) {
		for(int i=1;i<ar.length;i++) {
			int temp=ar[i];
			int j=i-1;
			while(j>=0 && ar[j]>temp) {
				ar[j+1]=ar[j];
				j--;
			}
			ar[j+1]=temp;
		}
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<ar.length;i++) {
			
			ar[i]=scanner.nextInt();
		}
		insertionSort(ar);
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+ " ");
		}
	}

}
