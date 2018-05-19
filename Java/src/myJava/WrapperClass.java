package myJava;

public class WrapperClass {

	public static void main(String[] args) {
		String s = "37654";
		int d = Integer.parseInt(s);
		System.out.println(d);
		
		String s1 = "gelohb";
		char i = s1.charAt(5);
		System.out.println(i);
		
		char j[] = s1.toCharArray();
		System.out.println(j.length);
	}

}
