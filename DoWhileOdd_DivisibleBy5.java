package BASICJAVAPRO;

public class DoWhileOdd_DivisibleBy5 {

	public static void main(String[] args) {
		int i=-10; //I
		do {
			if(i%5==0&&i%2!=0) {
				System.out.println(i);
			}
			i++; //U
		}
		while(i<=10); //C
	}
}
