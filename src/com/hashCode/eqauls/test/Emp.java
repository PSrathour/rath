package com.hashCode.eqauls.test;

public class Emp {
		private int age ;
		
		public Emp( int age )
		{
			super();
			this.age = age;
		}
		
		//comment below code and then check the result
		public boolean equals( Object obj )
		{
			boolean flag = false;
			Emp emp = ( Emp )obj;
			if( emp.age == age )
				flag = true;
			return flag;
		}
		
	}
