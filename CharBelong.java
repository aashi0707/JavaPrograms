package BASICJAVAPRO;

public class CharBelong {

	public static void main(String[] args) {
		char ch='$';
		
		if ((ch>='A' && ch<='Z') ||  (ch>='z' && ch<='Z')) {
			System.out.println(ch+" is an alphabet");
		}
		else if(ch>='0' && ch<='9') {
			System.out.println(ch+" is a number");
		}
		else {
			System.out.println(ch+ " is a special character");
		}
	}
}
