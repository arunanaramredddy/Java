package Programs;

import java.util.Scanner;

public class ProductOfArray {
	
	static int[] productArray(int[] ar) {
		int p=1;
		for(int i=0;i<ar.length;i++) {
			p=p*ar[i];
		}
		int[] res=new int[ar.length];
		for(int i=0;i<res.length;i++) {
			res[i]=p/ar[i];
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		System.out.print(ProductOfArray.res+" ");
		
		
		
	}

}
