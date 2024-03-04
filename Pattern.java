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
	