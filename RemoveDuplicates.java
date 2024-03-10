import java.util.LinkedHashSet;
import java.util.Scanner;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String res=removeDuplicates(s);
        System.out.println(res);

    }

    static String removeDuplicates(String s) {
        LinkedHashSet<Character> set=new LinkedHashSet<Character>();
        for(int i=0;i<s.length();i++) {
            char ch=s.charAt(i);
            set.add(ch);
        }
        String t="";
        for(Character ch:set) {
            t=t+ch;
        }
        return t;
    }
}
