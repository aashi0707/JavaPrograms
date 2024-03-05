package NumberPrograms;

public class ProductOfEachDigit {

	public static void main(String[] args) {
		int n=456, pro=1, sum=0;
		
		while(n>0) {
			int rem=n%10;
			sum=sum+rem;
			pro=pro*rem;
			n=n/10;
		}
		System.out.println(sum+ " "+pro);
	}

}
