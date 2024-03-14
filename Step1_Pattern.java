package PatternPrograms;

public class Step1_Pattern {

	public static void main(String[] args) {
		
		int n=4;
		System.out.println("--L shape--");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==n || j==1) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		
		
		
		System.out.println("--Opposite L shape--");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==n || j==n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		
		System.out.println("--Inverted L shape--");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 || j==1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
		
		System.out.println("--Opposite Inverted L shape--");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 || j==n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
		
		System.out.println("--Parallel--");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1 || j==n) {
					System.out.print("*");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
		
		
		System.out.println("--Equal--");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 || i==n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println( );
		}
		
		
		System.out.println("--C-shape--");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 || i==n || j==1) {
					System.out.print("* ");
				}
			}
			System.out.println( );
		}
		
		
		System.out.println("--Square--");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 || i==n || j==1 || j==n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println( );
		}
		
		
	}
}
