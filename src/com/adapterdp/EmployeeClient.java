package com.adapterdp;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

	public List<Employee> getEmployyeList(){
		List<Employee> empList=new ArrayList<>();
		EmplyeeDb emplyeeDb=new EmplyeeDb("123", "ankur", "a@b.com");
		empList.add(emplyeeDb);
		EmployeeLdap employeeLdap=new  EmployeeLdap("333", "singh", "x@y.com");
		empList.add(new EmployeeAdapterLdap(employeeLdap));
		return empList;
	}
	
}
