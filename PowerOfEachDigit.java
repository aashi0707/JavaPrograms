package NumberPrograms;

public class PowerOfEachDigit {

	public static void main(String[] args) {
		int n=345,ex=3;
		
		while(n>0) {
			int rem=n%10;
			int pow=1;
			for(int i=1;i<=ex;i++) {
				pow=pow*rem;
			}
			System.out.println(rem+" -> "+pow);
			n=n/10;
		}
	}

}
