package myPackage;

public class myString {

	public static void main(String[] args) {
		
		Testclass.method1();
	}
}	
	
class Testclass 
{
 public static void method1()
			{
	 try 
		{
				int a[][] = {{10,7,7},{4,6,8},{4,0,2}};
				for (int i = 0; i < a.length; i++)
				{
					for (int j = 0; j < a[i].length; j++) 
					{
						System.out.println(a[i][j]+ " ");
					}
				
				}
				System.out.println();
				}
			
			catch (Exception e)
			
			{
				System.out.println("error" + e.getMessage());
			}
			
			finally
			{
				System.out.println("execute");
				}
			}
	}
		
		
			
 



