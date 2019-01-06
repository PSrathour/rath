package com.ps.test.lab;

import java.util.ArrayList;
import java.util.Collections;

import java.util.Iterator;


public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee(006,"ps",10000);
		Employee emp2=new Employee(004,"dd",50000);
		Employee emp3=new Employee(003,"aa",60000);
		Employee emp4=new Employee(002,"dd",10000);
		Employee emp5=new Employee(005,"pa",10000);
		Employee emp6=new Employee(001,"cc",10000l);
		
		ArrayList <Employee>al=new ArrayList<Employee>();
		al.add(emp1);
		al.add(emp2);
		al.add(emp3);
		al.add(emp4);
		al.add(emp5);
		al.add(emp6);
		Iterator it=al.iterator();
			System.out.println("Before Sorting");
		while (it.hasNext()) {
			Employee emp = (Employee) it.next();
		System.out.println("Employee ID= "+emp.geteId()+" Emp Name= "+emp.geteName()+" Emp Salary= "+emp.getEmpSalary());
			
		}
		//sort the Employee by Name
		Collections.sort(al, new Employee());
		Iterator it2=al.iterator();
		System.out.println("After Sorting");
		while (it2.hasNext()) {
			Employee emp = (Employee) it2.next();
		System.out.println("Employee ID= "+emp.geteId()+" Emp Name= "+emp.geteName()+" Emp Salary= "+emp.getEmpSalary());
			
		}
	}

}
