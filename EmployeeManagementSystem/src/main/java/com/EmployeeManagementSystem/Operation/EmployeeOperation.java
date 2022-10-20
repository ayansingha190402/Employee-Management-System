/* Program :Create a Account and perform synchronized 
withdrawal in it using Threads		
		
 
@Part -  3 - OpeartionInterface.java 
@author: Ayan Singha
@Date : 20 Oct 2022
@Lab Assesment by Shuruti Singhal Mam 
@Version: 1
*/

//defining package 
package com.EmployeeManagementSystem.Operation;

//importing packages 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//importing class under  our own defining packages 
import  com.EmployeeManagementSystem.Employee.Employee;
import  com.EmployeeManagementSystem.Implimetion.OperationInterface;


//creating the class EmployeeOpeartion
//implements OpeartionInterface class
//to implement an interface of abstract class OpeartionInterface  
public class EmployeeOperation implements OperationInterface   {
	
	//creating array for employee
	List<Employee> EmployeeList = new ArrayList<Employee>();
	// creating object for scanner class
	Scanner sc = new Scanner(System.in);
	
	//overriding the method addEmployee
	@Override
	public void addEmployee() {

		// creating object of Employee cllas 
		Employee staff = new Employee();
		
		// inputing the details of an employee  
		
		//input id
		System.out.println("Enter the id :");
		staff.setId(sc.nextInt());
		
		//input name
		System.out.println("Enter the name :");
		staff.setName(sc.next()); 
		
		//input age
		System.out.println("Enter the Age:");
		staff.setAge(sc.nextInt());
		
		//input designation 
		System.out.println("Enter the desiganation:");
		staff.setDesiganation(sc.next());
		
		//input department 
		System.out.println("Enter the department:");
		staff.setDepartment(sc.next());
		
		//input salary
		System.out.println("Enter thes alary;:");
		staff.setSalary(sc.nextDouble());

		// adding the student into the collection
		EmployeeList.add(staff);
		System.out.println(EmployeeList);

	}//end 

	//overriding the method deleteEmployee
	@Override
	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		
		//declaring boolean variable
		//for store the status whether 
		//specific iD present or not in database 
		boolean status = false;
		
		//first taking null value for
		//object of Employee class
		Employee delID = null;
		
		// finding id
		for (Employee staff : EmployeeList) {
			if (staff.getId() == id)//checking 
				 delID = staff;//if found , then storing value
		}
		// check iD present or not 
		//checking condition
		if (delID != null)
			//then removing employee details
			//against the entered iD 
			EmployeeList.remove(delID);
			//and returning status true
			status = true;
			
		//returning value of status 
		return status;
	}//end

	//overriding the method findEmployee
	@Override
	public Employee findEmployee(int id) {

		//first taking null value for
		//object of Employee class
		Employee findEmployee = null;
		
		// using of for loop for finding 
		for (Employee staff : EmployeeList) {
			//checking
			if (staff.getId() == id)
				//if found
				//then storing the value
				findEmployee = staff;
		}

		//returning value of status 
		return findEmployee;
	}//end


	//overriding the method updateEmployee
	@Override
	public boolean updateEmployee(int id) {
		// TODO Auto-generated method stub
		//defining the boolean varieable
		boolean status = false;
		
		//first taking null value for
		//object of Employee class
		Employee findEmployee = null;
		
		// for loop for finding 
		for ( Employee staff : EmployeeList) {
			
			//checking 
			if (staff.getId() == id)
				//if found
				//then storing the value
				findEmployee  = staff;
		}
		
		//if iD found
		//then findEmployee not equal to null
		if (findEmployee  != null) {
			
			//declaring integer variable
			int choice = 0;
			
			//printing
			System.out.println("1. Update Employee Name");
			System.out.println("2. Update Employee Age");
			System.out.println("3. Update Employee Desihnation");
			System.out.println("4. Update Employee Department");
			System.out.println("5. Update Employee Salary");
	
			//taking input
			choice = sc.nextInt();
			
			//staring of switch case
			switch (choice) {
			case 1:
				System.out.println("Enter the name :");
				findEmployee.setName(sc.next());
				System.out.println("--> Employee Name  updated");
				status = true;
				break;

			case 2:
				System.out.println("Enter the Age:");
				findEmployee.setAge(sc.nextInt());
				System.out.println("--> Employee Age  updated");
				status = true;
				break;
			
			case 3:
				System.out.println("Enter the desiganation:");
				findEmployee.setDesiganation(sc.nextLine());
				System.out.println("--> Employee Designation  updated");
				status = true;
				break;
				
			case 4:	
				System.out.println("Enter the department:");
				findEmployee.setDepartment(sc.nextLine());
				System.out.println("--> Employee Department   updated");
				status = true;
				break;
				
			case 5:	
				System.out.println("Enter thesalary;:");
				findEmployee.setSalary(sc.nextDouble());
				System.out.println("--> Employee Salary  updated");
				status = true;
				break;

			default:
				System.out.println("Wrong Input.......  Try  again ...........");
			}//end

		} else//if iD not found
			//then findEmployee has default false
			status = false;
		
		//returning the value status 
		return status;
	}//end
	
	//overriding the method //overriding the method updateEmployee
	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub

		//starting of for loop
		for (Employee staff : EmployeeList) {
			//printing the details 
			System.out.println("\n\n===========================================================================");
			System.out.println("===========================================================================");
			System.out.println("As per Database ..... ");
			System.out.println( "Employee Details:" ); 
			System.out.println( " Id :" + staff.getId()); 
			System.out.println( " Name :" + staff.getName());  
			System.out.println( " Age :" + staff.getAge());  
			System.out.println( " Designation :" + staff.getDesiganation());  
			System.out.println( " Department :" + staff.getDepartment());  
			System.out.println( " Salary:" + staff.getSalary()); 
			System.out.println("===========================================================================");
			System.out.println("===========================================================================\n\n");
		}//end of for loop

	}//end
	

}//end of Employee EmployeeOpeartion Class
	
