package BASICJAVAPRO;

public class NestedWhileLoop {

	public static void main(String[] args) {
		System.out.println("---Using Nested while loop---");
		int i=1;
		while(i<=2) 
		{
			int j=1;
			while(j<=5)
			{
				System.out.print(j+ " ");
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
