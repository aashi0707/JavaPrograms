package NumberPrograms;

public class NeonNumber {

	public static void main(String[] args) {
		int n=9, sq=n*n, sum=0;
		
		while(sq>0) {
			int rem=sq%10;
			sum=sum+rem;
			sq=sq/10;
		}
		if(sum==n) {
			System.out.println("Neon Number");
		}
		else {
			System.out.println("Not a neon number");
		}

	}

}
