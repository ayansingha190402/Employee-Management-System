/* Program :Create a Account and perform synchronized 
withdrawal in it using Threads		
		
 
@Part - 1  - Employee.java 
@author: Ayan Singha
@Date : 20 Oct 2022
@Lab Assesment by Shuruti Singhal Mam 
@Version: 1
*/

//defining package 
package com.EmployeeManagementSystem.Employee;

//defining the class Employee
public class Employee {
	
	//declaring private instance varieable
	private int id;
	private String name;
	private int  age;
	private String desiganation;
	private String department;
	private double salary;
	
	//genarting constructor from superclass - object
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// genating constructor using fields 
	public Employee(int id, String name, int age, String desiganation, String department, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.desiganation = desiganation;
		this.department = department;
		this.salary = salary;
	}
	
	/**********************************************
	 ****Creating getter and setter ***************
	 **********************************************/
	
	//getter for iD variable
	public int getId() {
		return id;
	}
	
	//setter for ID variable
	public void setId(int id) {
		this.id = id;
	}
	
	//getter for name variable
	public String getName() {
		return name;
	}
	
	//setter for name variable
	public void setName(String name) {
		this.name = name;
	}
	
	//getter for age variable
	public int getAge() {
		return age;
	}
	
	//setter for age variable
	public void setAge(int age) {
		this.age = age;
	}
	
	//getter for designation variable
	public String getDesiganation() {
		return desiganation;
	}
	
	//setter for designation variable
	public void setDesiganation(String desiganation) {
		this.desiganation = desiganation;
	}
	
	//getter for department variable
	public String getDepartment() {
		return department;
	}
	
	//setter for department variable
	public void setDepartment(String department) {
		this.department = department;
	}
	
	//getter for salary variable
	public double getSalary() {
		return salary;
	}
	
	//setter for salary variable
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	//toString method using fields
	//it return a string representation of an object
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", desiganation=" + desiganation
				+ ", department=" + department + ", salary=" + salary + "]";
	}
	
}
//end of class Employee
