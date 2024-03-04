package BASICJAVAPRO;

import java.util.Scanner;

public class CalculatorSwitch {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("---Simple Calculator---");
		System.out.println("1.Addition" + "\n2.Subtraction" + "\n3.Multiplication" + "\n4.Division");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Enter choice");
		int choice=s.nextInt();
		int a,b;
		
		switch(choice) {
		case 1: { System.out.println("Enter two values");
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("Addition :"+(a+b));
		break;
		}
		case 2: { System.out.println("Enter two values");
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("Subtraction :"+(a-b));
		break;
		}
		case 3: { System.out.println("Enter two values");
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("Multiplication :"+(a*b));
		break;
		}
		case 4: { System.out.println("Enter two values");
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("Division :"+(a/b));
		break;
		}
		default: System.out.println("Invalid choice");
		// default: System.err.println("Invalid choice");   // err will print in red colour
     }
   }
}
