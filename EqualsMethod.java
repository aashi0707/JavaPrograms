package StringPrograms;

public class EqualsMethod {

	public static void main(String[] args) {
		String s1="java";
		String s2=new String("java");
		String s3="java";
		String s4=new String("javA");
		
		System.out.println("--double equals(==");
		System.out.println(s1==s3); //true
		System.out.println(s2==s4); //false
		
		System.out.println("--equals method");
		System.out.println("s1.equals(s3): "+s1.equals(s3));
		System.out.println("s2.equals(s4): "+s2.equals(s4));
	}

}
