package Programs;

import java.util.Scanner;

public class SegmentsInString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(countSegments(s));
	}
	 static int countSegments(String s) {
		 int segments=0;
		 for(int i=0;i<s.length();i++) {
			 if((i==0||s.charAt(i-1)==' ')&&s.charAt(i)!=' ') {
				 segments++;
			 }
		 }
		 return segments;
		 
	 }

}
