package BASICJAVAPRO;

public class NestedDoWhileLoop {

	public static void main(String[] args) {
		System.out.println("--Nested do while loop");
		int i=1;
		do {
			int j=1;
		do {
			System.out.print(j +" ");
			j++;
		}
		while(j<=5);	
			
			System.out.println();
			i++;
		}
		while(i<=2);
	}
}


/* 
 output --Nested do while loop
1 2 3 4 5 
1 2 3 4 5

*/