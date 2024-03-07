package NumberPrograms;

public class PowerOfGivenBase {

	public static void main(String[] args) {
		int base=5, ex=3;
		int pow=1;
		
		for(int i=1;i<=ex;i++) {
			pow=pow*base;
		}
		System.out.println(pow);
	}

}
