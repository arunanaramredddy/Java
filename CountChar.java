import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Map;
import java.util.Map.Entry;


public class CountChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res=occurence(str);
        System.out.println(res);
    }
    static String occurence(String str) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if(map.containsKey(ch)) {
                int count = map.get(ch);
                map.put(ch, count+1);
            }
            else {
                map.put(ch, 1);
            }
        }
        Set<Entry<Character, Integer>> entries = map.entrySet();
        String t="";
        for(Entry<Character,Integer> entry:entries) {
            t=t+(entry.getKey()+""+entry.getValue());
        }
        return t;
    }

}
