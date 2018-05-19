package myPackage;

public class Abstractdemo extends CallingAbstructor
{
	public void method1()
	{
		System.out.println("method1");
	}
	public void method2()
	{
		System.out.println("method2");
	}
	
	public static void method4()
	{
		System.out.println("method4");
	}
	
	public static void main(String[] args) 
	{
		
		Abstractdemo abc = new Abstractdemo();
		abc.method1();
		abc.method2();
		abc.method3();
		Abstractdemo.method4();
	}

}
