package NumberPrograms;

public class CompositeRange {

	public static void main(String[] args) {
		
		for(int n=1;n<=10;n++) {
			int c=0;
			for(int i=1;i<=n;i++) {
				if(n%i==0) {
					c++;
				}
			}
			if(c>2) {
				System.out.println(n);
			}
		}
	}
}
