package Programs;

import java.util.Scanner;

public class SumAtLast  {
	static String removeSpecialCharacters(String s) {
		String t=" ";
		int sum=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')) {
				t=t+ch;
			}
			else if(ch>='0' && ch<='9') {
				sum=sum+ch-48;
			}
		}
		return t+sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.print(removeSpecialCharacters(s));
	}

}
