package com.src;
//use of extends keyword to perform inheritance

class Dogg extends Mammal {
//methods and fields of mammal
	//methods and fields of dogg
	public void  sound() {
		System.out.println("i bark");
				
	}
	public static void main(String[] args) {
		//creating an object of sub class /child class 
		Dogg d=new Dogg();
		//accesing fields of superclass
		//called method of superclass using object of class
		d.eat();
		d.nature();
		d.sound();
	}
}
