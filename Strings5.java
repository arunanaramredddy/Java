// remove vowels

package Program;

public class Strings5 {

	static String removeVowels(String s) {
	   String t="";
        for(int i=0;i<s.length();i++) {
		   char c=s.charAt(i);
		   if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
								
			}
		   else {
			   t=t+c;
		   }

	   }
	   return t;
   }

	public static void main(String[] args) {
		String s="abcghf";
		System.out.println(removeVowels(s));
	}

}
