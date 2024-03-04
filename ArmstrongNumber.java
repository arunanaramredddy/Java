package Programs;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int n=153;
		int temp=n;
		int sum=0;
		while(temp>0) {
			int rem=temp%10;
			sum+=rem*rem*rem;
			temp/=10;
		}
		if(sum==n) {
			System.out.println(n + " "+"is a an Armstrong number");
		}
		else {
			System.out.println(n +" "+"is not an ArmStrong number");
		}
	}

}
