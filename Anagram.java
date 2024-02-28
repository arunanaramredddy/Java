package Programs;

import java.util.Scanner;

public class Anagram {
	public static  boolean isAnagram(String s,String t) {
		int m=s.length();
		int n=t.length();
		int[] ar=new int[26];
		for(int i=0;i<m;i++) {
			ar[s.charAt(i)-'a']++;
		}
		for(int i=0;i<n;i++) {
			ar[t.charAt(i)-'a']--;
		}
		for(int i=0;i<ar.length;i++) {
			if(ar[i]!=0) {
				return false;
			}
		}
		return true;
		
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String t=sc.nextLine();
		System.out.println(isAnagram(s, t));
		
	}

}
