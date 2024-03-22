package Programs;

import java.util.Scanner;

public class FindLeaders {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		findLeaders(ar);
		
	}
	static void findLeaders(int[] ar) {
		int len=ar.length;
		int max=ar[len-1];
		for(int i=len-1;i>=0;i--) {
			max=ar[i];
			System.out.println(ar[i]+"\t");
		}
	}

}
