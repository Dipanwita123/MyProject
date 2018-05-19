package myPackage;

import java.util.Scanner;

public class Scannerclass {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter: ");
		
		int a = sc.nextInt();
		System.out.println("Enter: "+ a);
		
		String s = sc.next();
		System.out.println("Enter: "+ s);

}
}
