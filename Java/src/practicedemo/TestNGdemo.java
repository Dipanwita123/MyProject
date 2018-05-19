package practicedemo;

import org.testng.annotations.Test;

public class TestNGdemo {
  @Test(priority=2,groups={"Reg","Sanity"})
  public void method1() {
 System.out.println("method1");
  }
 
 @Test(priority=1,groups={"Reg"})
 public void method2() {
System.out.println("method2");
 }

@Test(priority=3,groups={"Sanity"})
public void method3() {
System.out.println("method3");
  }
}
