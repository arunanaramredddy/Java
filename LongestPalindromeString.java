package Programs;

import java.util.Scanner;

public class LongestPalindromeString 
{
	static void longestPalindrome(String s) 
	{
		for(int size=s.length();size>=1;size--)
		{
			for(int i=0;i<=s.length()-size;i++)
			{
				String t="";
				for(int j=i;j<i+size;j++) 
				{
					t=t+s.charAt(j);
				}
				if(isPalindrome(t)) 
				{
					System.out.print(t);
				    return;
			    }
		    }
		}
	}				
				
		    	static boolean isPalindrome(String s) {
					int i=0,j=s.length()-1;
					while(i<j) {
						if(s.charAt(i)==s.charAt(j)) {
							i++;
							j--;
						}
						else {
							return false;
						}
					}
					return true;
				}

							
		
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		longestPalindrome(s);
	 

	}

}
