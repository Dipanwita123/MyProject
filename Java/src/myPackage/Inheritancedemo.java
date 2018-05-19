package myPackage;

public class Inheritancedemo {

	public static void main(String[] args) {
		
childclass7.method8();
childclass7.method1();
childclass7.method0();
childclass7.method6();

	}

}

class childclass89 extends Testclass
{
	public static void method8()
	{
		System.out.println("demo");
	}
}
class childclass9 extends Testclass
{
	public static void method5()
	{
		System.out.println("classdemo");
	}
}
class childclass8 extends childclass89
{
	public static void method6()
	{
		System.out.println("inheritance");
	}
}
class childclass7 extends childclass8
{
	public static void method0()
	{
		System.out.println("inheritanceclass");
	}
}
class childclass12 extends Testclass
{
	public static void method123()
	{
		System.out.println("class");
	}
}
