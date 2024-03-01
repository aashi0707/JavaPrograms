package BASICJAVAPRO;

public class NestedIfElse {

	public static void main(String[] args) {
		int weight=50;
		char bloodGroup='O';
		
		if(weight>45) {
		if(bloodGroup=='O') {
				System.out.println("Eligible to donate blood");
		}
		else {
			System.out.println("Blood is not matching");
		}
	}
		else {
			System.out.println("Weight should be greater than 45");
		}	
	}
}
