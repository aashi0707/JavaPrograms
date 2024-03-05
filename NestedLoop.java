package BASICJAVAPRO;

import java.util.Iterator;

public class NestedLoop {

	public static void main(String[] args) {
//		for (int i=1; i<=5 ; i++) {
//		System.out.print(i+ " ");             1 2 3 4 5
//		}
		
	/*	for (int i=1; i<=5 ; i++) {				
			System.out.println(i+ " ");			it will print 1 2 3 4 5 in diff lines
		} */
		
		System.out.println("---Using Nested For Loop---");
		for(int i=1;i<=2;i++) {
			for(int j=1;j<=5;j++) {
			System.out.print(j +" ");
		}
			System.out.println();	
	}
  }
}
