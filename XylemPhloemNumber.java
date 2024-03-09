package NumberPrograms;

public class XylemPhloemNumber {

	public static void main(String[] args) {
		int n=1458, last=n%10; n=n/10;
		int isum=0, osum=0;
		while(n>9) {
			int rem=n%10;
			isum=isum+rem;
			n=n/10;
		}
		osum=n+last;
		if(osum==isum)
			System.out.println("Xylem");
		else
			System.out.println("Phloem");
	}

}
