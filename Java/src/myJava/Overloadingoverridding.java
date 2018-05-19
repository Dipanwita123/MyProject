package myJava;

import myPackage.Constructordemo;

class Overloadingoverridding {
	
	public static void main(String[] args) {
		lesiondemo ovr = new lesiondemo();
		ovr.operation(2,5);
		ovr.operation(4,9f);
//		Encapsdemo enc = new Encapsdemo();
//		enc.setAge(67);
//		System.out.println(enc.getAge());
		
		Encapsdemo c = new Constructordemo();
		c.setAge(67);
		System.out.println(c.getAge()); //upcasting
		
		Constructordemo cb = (Constructordemo)c;
		cb.setAge(87);
		System.out.println(cb.getAge());  //downcasting
		
		
		
	
	}
	private double age;
	public void setAge(double age2)
	 {
		 this.age = age2;
	 }
	 public double getAge()
	 {
		 return age;
	 }
	}


