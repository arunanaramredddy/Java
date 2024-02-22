package collections;
import java.util.ArrayList;
import java.util.LinkedList;
public class Program2 {

			public static void main(String[] args) {
			LinkedList<Integer> list = new LinkedList<Integer>();
			list.add(100);
			list.add(500);
			list.add(null);
			list.add(45);
			
			
			for(int i=0;i<list.size();i++) {
				
				System.out.println(list.get(i));
			}


	}


}
