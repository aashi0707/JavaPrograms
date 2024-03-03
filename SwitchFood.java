package BASICJAVAPRO;

import java.util.Scanner;

public class SwitchFood {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("---Food Menu---");
		System.out.println("1.Idli" + "\n2.Dosa" + "\n3.Poori" + "\n4.Biryani");
		System.out.println("Order Food");
		
		int choice=s.nextInt();
		switch(choice) {
		case 1: System.out.println("Idli ordered");
		break;
		case 2: System.out.println("Dosa ordered");
		break;
		case 3: System.out.println("Poori ordered");
		break;
		case 4: System.out.println("Biriyani ordered");
		break;
		default: System.out.println("Invalid choice");
		}
	}
}
