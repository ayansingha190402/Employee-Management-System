/* Program :Create a Account and perform synchronized 
withdrawal in it using Threads		
		
 
@Part - 2  - OperationInterface.java 
@author: Ayan Singha
@Date : 20 Oct 2022
@Lab Assesment by Shuruti Singhal Mam 
@Version: 1
*/

//defining the package 
package com.EmployeeManagementSystem.Implimetion;

//importing Employee class under com.EmployeeManagementSystem.Employee  package
import  com.EmployeeManagementSystem.Employee.Employee;

//defining abstract class OperationInterface 
public interface OperationInterface {
	
	//methods under OperationInterface  abstract class 
	void addEmployee();

	boolean deleteEmployee(int id);

	boolean updateEmployee(int id);

	Employee findEmployee(int id);

	void displayDetails();

}
// end of class OpeartionInterface class