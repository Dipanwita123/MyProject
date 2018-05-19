package myPackage;


public class Interfacedemo {

	public static void main(String[] args) {
		Testclass2 tc = new Testclass2();
		tc.method1();
		tc.method4();
		iInterface.method2();
	System.out.println(iInterface.a);
	
	}
}
	
	interface iInterface
	{
		int a = 97;
		
		void method1();
		public static void method2()
		{
			System.out.println("method");
		}
		
		
	}


interface iInterface2 extends iInterface
{
	void method4();
}

class Testclass2 implements iInterface2
{
	public void method1()
	{
		System.out.println("method2");
	
}
	public void method4()
	{
		System.out.println("method3");
	}
}