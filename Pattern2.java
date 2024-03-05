package Programs;

public class Pattern2 {
	
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
