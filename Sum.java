package com.src;

public class Sum {
	//method of sum
	int sum(int x,int y) {
		return x+y;
	}
	int sum(int x,int y,int z) {
		return x+y+z;
	}
	int Sum (int x,int y) {
		return x+y;
	}
	
	double sum(double x,double y) {
		return x+y;
	}
	public static void main(String[] args) {
		//TODO auto generate method 
	Sum s =new Sum();
	//object of class sum
	System.out.println(s.sum(1,2));
	System.out.println(s.sum(1,2.8));
	System.out.println(s.sum(1,2,0));
	}

}
