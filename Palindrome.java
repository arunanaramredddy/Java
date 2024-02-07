package Programs;

import java.util.Scanner;

public class Palindrome {
	static String isPalindrome(String s) {
		int i=0,j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)==s.charAt(j)) {
				i++;
				j--;
			}
			else {
				return "Not Palindrome";
			}
		}
		return "Palindrome";
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.print(isPalindrome(s));
	}

}
