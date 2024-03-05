 package NumberPrograms;

public class ExtractAllDigit {

	public static void main(String[] args) {
		int n=546869;
		
		while(n>0) {
			int rem=n%10;
			System.out.println(rem);
			n=n/10;
		}
		
	}

}
