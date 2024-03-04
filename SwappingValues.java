package Programs;

public class SwappingValues {
	
	    public static void main(String[] args) {
	        int a=10,b=20,c=30,d=40;
	        System.out.println("Before swapping a="+ a +" b=" + b +" c=" + c +" d=" + d);
	        d=a+b+c+d;
	        a=d-a-b-c;
	        b=d-a-b-c;
	        c=d-a-b-c;
	        d=d-a-b-c;
	        System.out.println("After swapping a=" + a +" b=" + b +" c=" + c +" d=" + d);

	    }
	    
	}

