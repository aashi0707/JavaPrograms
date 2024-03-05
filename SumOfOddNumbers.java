package NumberPrograms;

public class SumOfOddNumbers {

	public static void main(String[] args) {
		// 1+3+5+7+9
		int sum=0;
		for(int i=1;i<=10;i++) {
			if(i%2!=0) {
				sum=sum+i;
			}	
		}
		System.out.println(sum);
	}
}
