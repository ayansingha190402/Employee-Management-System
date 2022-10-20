/* Program :Create a Account and perform synchronized 
withdrawal in it using Threads		
		
 
@Part -  4 - Final -  Final.java 
@author: Ayan Singha
@Date : 20 Oct 2022
@Lab Assesment by Shuruti Singhal Mam 
@Version: 1
*/


//defining packages 
package com.EmployeeManagementSystem.Employee.Apptest;

//importing Scanner class 
import java.util.Scanner;

//importing class under  our own defining packages 
import  com.EmployeeManagementSystem.Employee.Employee;
import  com.EmployeeManagementSystem.Implimetion.OperationInterface;
import com.EmployeeManagementSystem.Operation.EmployeeOperation;

//declaring the class Apptest
public class AppTest {
	
	//declaring the method userChoice
	public static int userChoice() {
		
		
		// creating object under  Scannerclass 
		Scanner sc = new Scanner(System.in);
		
		//printing 
		System.out.println("MENU:");
		System.out.println("1. Add New Employee Details");
		System.out.println("2. Delete Existing Employee");
		System.out.println("3. Update Existing Employee Details");
		System.out.println("4. Search Any Enployee Deatils");
		System.out.println("5. Display all the existing Employee Deatils");
		System.out.println("6. Exit  App");
		
		//taking user input 
		int choice = sc.nextInt();
		
		//returning the value of choice 
		return choice;
	}//end 
	
	//declaring the method operationcall
	public static void operationcall() {
		
				// creating object under  Scannerclass 
				Scanner sc = new Scanner(System.in);
				// creating object of EmployeeOperation class
				EmployeeOperation newOffice= new EmployeeOperation();
				


				// declaring integer variable 
				//try - catch
				try {
					
					//declaring integer variable 
					int choice = 0;
					
					//starting of do - while loop 
					//for continuous action
					do {
						//calling the method userChoice
						//storing its returned value 
						choice=userChoice();
						
						//starting of switch case 
						switch (choice) {
						case 1:
							
							//calling the method addEmployee
							newOffice.addEmployee();
							System.out.println("New Employee Entered");//print
							break;
						case 2:
							System.out.println("Enter the Id of the Employee to be deleted:");//print
							
							//taking input 
							int id = sc.nextInt();
							
							//calling the function deleteEmployee
							//storing the boolean value of status
							//returned by the method 
							boolean flag = newOffice.deleteEmployee(id);
							
							//checking
							//here flag=true 
							if (flag)
								System.out.println("Employee dEtails Delete");//print
							else
								System.out.println("Can`t find what you look for ....");//print
							break;

						case 3:
							System.out.println("Enter Employee ID to be updated :");//print
							//taking input
						    id = sc.nextInt();
						    
						    //calling the function updateEmployee
							//storing the boolean value of status
							//returned by the method 
							flag = newOffice.updateEmployee(id);
							
							//checking
							//here flag=true 
							if (flag)
								System.out.println("Employee details updated ");//print
							else
								System.out.println("Can`t find what you look for ....");//print
							break;

						case 4:
							//first taking null value for
							//object of Employee class
							Employee staff = null;
							
							//print
							System.out.println("Enter the Employee ID to show details:");
							
							//taking input 
							id = sc.nextInt();
							
							//calling the function findEmployess
							//storing the boolean value of status
							//returned by the method 
							staff = newOffice.findEmployee(id);
							
							//starting of if else 
							//checking 
							if (staff == null)
								System.out.println("Can`t find what you look for ....");
							else
								//printing employess details 
								System.out.println("As per Database ..... ");
								System.out.println( "Employee Details:" ); 
								System.out.println( " Id :" + staff.getId()); 
								System.out.println( " Name :" + staff.getName());  
								System.out.println( " Age :" + staff.getAge());  
								System.out.println( " Designation :" + staff.getDesiganation());  
								System.out.println( " Department :" + staff.getDepartment());  
								System.out.println( " Salary:" + staff.getSalary());  
								break;

						case 5:
							//calling the function displayDetails
							newOffice.displayDetails();
							break;

						case 6:
							//for exit 
							System.exit(0);
							break;
						//default case 
						default:
							System.out.println("Wrong input.......");

						}//end of switch case 

					} while (choice != 6);//while part of do-while loop

					// end of do while

					sc.close();//closing Scanner class
				} catch (Exception e) {
					System.out.println(e);
				}
	}//end of


	//declaring main class 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		operationcall();
		

	}//end 

}//end of class
