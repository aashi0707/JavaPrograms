package BASICJAVAPRO;

public class Switch1 {

	public static void main(String[] args) {
		String choice="java";
		
		switch(choice) {
		case "java":	System.out.println("Java");
		break;
		
		case "python":	System.out.println("Python");
		break;
		
		case "html":	System.out.println("HTML");
		break;
		
		case "css":		System.out.println("CSS");
		break;
		default:		System.out.println("Invalid choice");
		}
	}

}
