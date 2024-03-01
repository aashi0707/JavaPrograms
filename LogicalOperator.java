package BASICJAVAPRO;

public class LogicalOperator {

	public static void main(String[] args) {
		String colour = "red";
		Boolean result = colour == "red" || colour == "black";
		System.out.println(result);
		
		
		System.out.println("---------------------");
		char size='S';
		int price=700;
		
		boolean result1=size=='S' &&price<=1000;
		System.out.println(result1);

	}

}
