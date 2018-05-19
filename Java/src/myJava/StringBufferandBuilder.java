package myJava;

public class StringBufferandBuilder {
	

	public static void main(String[] args)
	{
//		try {
//			StringBuffer sb1 = new StringBuffer ("Testing");
//			
//			System.out.println(sb1.delete(3,6));
//		}
//		
//catch (Exception e)
//		{
//	System.out.println("Oops!error occured" + e.getMessage());
//		}
//	
//	finally
//	{
//		System.out.println("please execute");
//	}
		
		StringBufferandBuilder sb = new StringBufferandBuilder();
		System.out.println(sb.method2().replaceAll("Session", "dipa").concat(" done"));
		sb.method2();


	}


public String method2()
{
String b = new String("Session complete");
//b=b.concat(" done"); // another way of line 25
return b;
}
}
