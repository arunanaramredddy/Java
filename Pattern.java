<<<<<<< HEAD
static String reverse(String s) {
		String t="";
		for(int i=s.length()-1;i>=0;i--) {
			t=t+s.charAt(i);
		}
		return t;
	}



	public class Pattern{
	
		public static void main(String []args)
		{  
			 int i,j,n=5;  
			  for(i=1;i<=n;i++)
			  {
				  for(j=n;j>=1;j--)
				  {
					  if(j!=i)  
					   System.out.print(j);  
					   else  
						System.out.print("*");  
			   }  
			   System.out.println("");  
			   }  
		} 
	
	}
	
=======
package Programs;

public class Pattern {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i*j<10) {
					System.out.print(0);
				}
				System.out.print(i*j + " ");
			}
			System.out.println();
		}
	}

}
>>>>>>> 62d64b5a57c7b9cf5b71ec09ea868ec8f8bc2a72
