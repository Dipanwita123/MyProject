package practicedemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;


public class TestNGclass1 {
	
	@BeforeClass
	public void method7() {
		  System.out.println("method7");
		  }
	
  @BeforeMethod
  public void method2() {
  System.out.println("method2");
  }

@Test
public void method1()
{
	System.out.println("method1");
}
@AfterClass
public void method6() {
	  System.out.println("method6");
	  }

@Test
public void method5()
{
	System.out.println("method5");
}
@AfterMethod
public void method3()
{
	System.out.println("method3");
}
}
