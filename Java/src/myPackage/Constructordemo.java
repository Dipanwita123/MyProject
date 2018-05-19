package myPackage;

import myJava.Encapsdemo;

public class Constructordemo extends Encapsdemo
{

	public static void main(String[] args) {
		myConstructor ab = new myConstructor(5, "dipa", 7f);
	
		System.out.println(ab.area +" "+ ab.address + " "+ab.distance);

	}

}
class myConstructor
{
	double area;
	String address;
	float distance;
	
	myConstructor()
	{
		System.out.println("execute");
	}
	myConstructor(String a, double b)
	{
		this.address = a;
		this.area = b;
	}
	myConstructor(String a, double b, float c)
	{
		this.address = a;
		this.area = b;
		this.distance = c;
	}
	myConstructor( double b, String a, float c)
	{
		this.address = a;
		this.area = b;
		this.distance = c;
	}
}