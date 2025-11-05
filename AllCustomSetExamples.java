package com.codegnan.collections;

import java.util.TreeSet;

public class AllCustomSetExamples {

	public static void main(String[] args) {
		TreeSet<Employee> employeelist1=new TreeSet<Employee>(new EmployeeComparator());
		employeelist1.add(new Employee(1111,"sree",60000,"hyderabad"));
		employeelist1.add(new Employee(1112,"siri",90000,"Bengaluru"));
		employeelist1.add(new Employee(1113,"kiki",70000,"pune"));
		employeelist1.add(new Employee(1114,"keerthi",80000,"Mumbai"));
		employeelist1.add(new Employee(1115,"chikky",40000,"Patna"));
		for(Employee list1:employeelist1) {
			System.out.println(list1);
		}
		//System.out.println(employeelist1);
	}
}