package myJava;

public class Encapsdemo 
{
 private double age;
 private float height;
 private String name;
 
 public void setAge(double age1)
 {
	 this.age = age1;
 }
 public double getAge()
 {
	 return age;
 }
 
 public void setHeight(float height1)
 {
	 this.height = height1;
 }
 public float getHeight()
 {
	 return height;
 }
 public void setName(String name1)
 {
	 this.name = name1;
 }
public String getName()
{
	return name;
}

public static void main (String[] args)
{
	Encapsdemo ec = new Encapsdemo();
	ec.setAge(87);
	ec.setHeight(5f);
	ec.setName("dipa");
	
	System.out.println(ec.getAge() + " " + ec.getHeight()+ " "+ ec.getName());
}


}
