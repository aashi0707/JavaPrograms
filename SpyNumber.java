package NumberPrograms;

public class SpyNumber {

	public static void main(String[] args) {
int n=123, pro=1, sum=0;
		
		while(n>0) {
			int rem=n%10;
			sum=sum+rem;
			pro=pro*rem;
			n=n/10;
		}

		if(sum==pro) {
			System.out.println("It is a spy number");
		}
		else {
			System.out.println("It is not a spy number");
		}
    }
}