package com.hashCode.eqauls.test;

import java.util.*;

public class HashCodeEqualsTest {

	public static void main(String[] args) {
		
		/*
		 * If you run the above program, the  output will be like the following. 
		 * HashSet Size--->>>5 hs.contains( new Emp(25))--->>>false 
		 * hs.remove( new Emp(24)--->>>false Now HashSet Size--->>>5
		 * It means that you can not find the object. However it is not the case for Integer object.
		 *You can put object of type Integer in a HashSet and you can try and you can see the effect.
		 * Now let us modify the “Emp” class so that we will get over the problems 
		 * what we faced in the above test harness class.
		*/
	Emp emp1 = new Emp(23);
	Emp emp2 = new Emp(24);
	Emp emp3 = new Emp(25);
	Emp emp4 = new Emp(26);
	Emp emp5 = new Emp(27);
	ArrayList<Emp> hs=new ArrayList<Emp>();
	
	//OR /HashSet<Emp> hs = new HashSet<Emp>();
	hs.add(emp1);
	hs.add(emp2);
	hs.add(emp3);
	hs.add(emp4);
	hs.add(emp5);
	
	System.out.println("HashSet Size--->>>"+hs.size());
	System.out.println("hs.contains( new Emp(25))--->>>"+hs.contains(new Emp(25)));
	int originalHashCode = System.identityHashCode(emp2);
	System.out.println("hs.identityHashCode "+originalHashCode+"   " +System.identityHashCode(new Emp(24)));
	System.out.println("hs.remove( new Emp(24)--->>>"+hs.remove( new Emp(24)));
	System.out.println("Now HashSet Size--->>>"+hs.size());
	
	}
}
