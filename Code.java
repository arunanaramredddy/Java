package Programs;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

 class Customer implements Comparable<Customer>{
	
	private int id;
	private String name;
	private String email;
	private int age;
	

	public Customer() {
		super();
	}


	public Customer(int id, String name, String email, int age) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
	}
	


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}


		public void setAge(int age) {
		this.age = age;
	}
	public int compareTo(Customer c2) {
		Customer c1=this;
		if(c1.name.compareTo(c2.name)!=0) {
			return c1.name.compareTo(c2.name);
		}
		else {
			return c1.email.compareTo(c2.email);
		}
		
		
	}
	public String toString() {
		return "("+id+","+name+","+email+","+age+")";
	}
	
}
 class MyCompare1 implements Comparator<Customer> {
	 //@override
	public int compare(Customer c1,Customer c2) {
		return c1.getId()-c2.getId();
	}
 }
	class MyCompare2 implements Comparator<Customer> {
		 //@override
		public int compare(Customer c1,Customer c2) {
			return( c1.getId()-c2.getId())*-1;
		}
 }
public class Code {
	public static void main(String[] args) {
		//MyCompare1 compare1 = new MyCompare1();
		MyCompare2 compare2 = new MyCompare2();
		TreeSet<Customer> set = new TreeSet<Customer>(compare2);
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			String s=sc.next();
			int id=1000+i;
			String[] ar=s.split(",");
			String name=ar[0];
			String email=ar[1];
			int age=Integer.parseInt(ar[2]);
			Customer c=new Customer(id,name,email,age);
			set.add(c);

		}
		for(Customer cus:set) {
			System.out.println(cus);
		}
	}
}
 
			


