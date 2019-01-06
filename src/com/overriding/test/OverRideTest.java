package com.overriding.test;

import java.io.FileNotFoundException;

class A  {
	  void m1() throws FileNotFoundException{
		  System.out.println("Hello A");
	  }
}
 
class B extends A{
	void m1() throws NullPointerException{
		System.out.println("Hello B");
	}
}
public class OverRideTest {
public static void main(String[] args) {
	A a=new A();
	B b=new B();
	a=b;
	b=(B) a;
	b.m1();
}
}
