package NumberPrograms;

public class SquareRoot {

	public static void main(String[] args) {
		int n=49;
		for(int i=1;i<=n/2;i++) {
			if(i*i==n) {
				System.out.println(i);
				break;
			}	
		}
	}
}
