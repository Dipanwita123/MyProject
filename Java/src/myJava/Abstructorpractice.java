package myJava;

class Abstructorpractice {

	public void method1()
	{
		System.out.println("method1");
	}
	
	private void method2()
	{
	System.out.println("method2");	
	}
	
	protected void method3()
	{
		Abstructorpractice.method6();
		System.out.println("method3");
	}
	
	void method4()
	{
		System.out.println("method4");
	}
	
	public static String method5()
	{ String a = "method5";
		return a;
	}
	
	public static void method6()
	{ System.out.println("method6");
		}
	

	public static void main(String[] args) {
		Abstructorpractice ab = new Abstructorpractice();
		ab.method1();
		ab.method2();
		ab.method3();
		ab.method4();
		System.out.println(method5());
	
		Abstructorpractice.method6();

	}
}

