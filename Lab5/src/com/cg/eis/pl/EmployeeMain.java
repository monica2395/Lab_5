package com.cg.eis.pl;


import com.cg.eis.service.EmployeeServiceImp;
import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;

import java.util.Scanner;

public class EmployeeMain {
	public static EmployeeServiceImp obj;
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		EmployeeServiceImp obj=new EmployeeServiceImp();
		obj.displayEmployeeDetail(obj.getEmployeeDetails());
	}
}
