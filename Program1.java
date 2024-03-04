package collections;

import java.util.ArrayList;

public class Program1 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(500);
		list.add(null);// here null is allowed because we are using integer class so null is allowed;
		list.add(23);
		list.add(45);
		
		
		for(int i=0;i<list.size();i++) {
			
			System.out.println(list.get(i));
		}
	}

}



