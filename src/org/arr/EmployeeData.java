package org.arr;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class EmployeeData extends Employee{
	public static void main(String[] args) {
		EmployeeData data=new EmployeeData();
		data.setEmpId(12);
		data.setEmpName("karthi");
		EmployeeData data1=new EmployeeData();
		data1.setEmpId(34);
		data1.setEmpName("sakthi");
		int id=data.getEmpId();
		System.out.println(id);
		System.out.println(data.getEmpName());
		List<Employee>li=new ArrayList<>();
		li.add(data1);
		li.add(data);
		Set<Employee>st=new HashSet<>();
		st.add(data1);
		st.add(data);
		for(Employee employee:st) {
			System.out.println(employee.getEmpId());
			System.out.println(employee.getEmpName());
;		}
	}

}
