package com.ps.test.lab;

import java.util.Comparator;

public class Employee implements Comparator{
int eId;
String eName;
long empSalary;

public int geteId() {
	return eId;
}
public void seteId(int eId) {
	this.eId = eId;
}
public String geteName() {
	return eName;
}
public void seteName(String eName) {
	this.eName = eName;
}

public long getEmpSalary() {
	return empSalary;
}
public void setEmpSalary(long empSalary) {
	this.empSalary = empSalary;
}

public Employee(int eId, String eName, long empSalary) {
	super();
	this.eId = eId;
	this.eName = eName;
	this.empSalary = empSalary;
}
public Employee() {
	// TODO Auto-generated constructor stub
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + eId;
	result = prime * result + ((eName == null) ? 0 : eName.hashCode());
	result = prime * result + (int) (empSalary ^ (empSalary >>> 32));
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	if (eId != other.eId)
		return false;
	if (eName == null) {
		if (other.eName != null)
			return false;
	} else if (!eName.equals(other.eName))
		return false;
	if (empSalary != other.empSalary)
		return false;
	return true;
}

/*@Override
public int compareTo(Object o) {
	// TODO Auto-generated method stub
	Employee emp=(Employee)o;
	
	return this.eId-emp.eId;
}*/


@Override
public int compare(Object o1, Object o2) {
	// TODO Auto-generated method stub
Employee emp1=(Employee)o1;
Employee emp2=(Employee)o2;
	
	if(emp1.geteName().equals(emp2.geteName())){
		return emp1.geteId()-emp2.geteId();
	}
	else {
		return emp1.geteName().compareTo(emp2.geteName());
	}
}


}
