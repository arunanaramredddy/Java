package Programs;

import java.util.Scanner;

public class LengthOfLastWord {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(lengthOfLastWord(s));
	}
	static int lengthOfLastWord(String s) {
		String t=s.trim();
		int count=0;
		for(int i=t.length()-1;i>=0;i--) {
			if(t.charAt(i)!=' ') {
				
				count++;
			}
		
		else {
			break;
		}
	}
		return count;
	}

}
