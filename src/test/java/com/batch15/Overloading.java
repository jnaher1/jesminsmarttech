package com.batch15;

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      add(50,15,5);
      add(2,3,9);
      subtract(10,5);
	}

	static void add( int a, int b) {
		System.out.println(a+b);
		
	}
	
	static void add(int a,int b,int c) {
	System.out.println(a+b+c);	
	}
	
	
 static void subtract (int a, int b) {
	System.out.println(a-b);
	}
}
 
 
	

