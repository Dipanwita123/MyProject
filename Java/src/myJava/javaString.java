package myJava;

public class javaString {

	public static void main(String[] args) {
		try
		{
		int i;
		int j;
		int array[][] = {{3,6,8},{7,8,2},{5,0,1}};
		System.out.println(array.length);
		for (i = 0; i < array.length; i++)
		{
			for (j = 0; j < array[i].length; j++)
			{
			if (array[i][j] == 4)
			{
				break;
			}
			else if (array[i][j] == 9)
			{
				break;
			}
			else if (array[i][j] == 8)
			{
				break;
			}
		System.out.println(array[i][j]+ " ");
			}
		}
		
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
