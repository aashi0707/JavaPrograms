package NumberPrograms;

public class Square {

	public static void main(String[] args) {
		int n=64; boolean flag=false;
		
		for(int i=1;i<=n;i++) {
			if(i*i==n) {
				flag=true;
				break;
			}
		}
		if(flag==true) {
			System.out.println("Perfect square");
		}
		else {
			System.out.println("Not a perfect square");
		}
	}

}
