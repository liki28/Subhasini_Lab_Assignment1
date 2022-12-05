package com.gl.main;

import java.util.Random;
import java.util.Scanner;
import com.gl.interfaces.Credentials;
import com.gl.model.Employee;
import com.gl.serivice.CredentialService;


public class DriverClass {
	
	public static void main(String[] args) {
		
		
		Employee employee=new Employee("Subhasini","Sahoo");
		
		Credentials c=new CredentialService();
		System.out.println("Name :"+"Subhasini Sahoo");
		System.out.println("Please enter the department from the following");
		
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resource");
		System.out.println("4.Legal");
		System.out.println("Enter your choice");
		
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();
		
		String generatedEmail=null;
		String generatedPassword=null;
		
		switch(option) {
		
		case 1:{
			generatedEmail=c.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(),"tech" );
			generatedPassword=c.generatePassword();
			break;
		}
		case 2:{
			generatedEmail=c.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(),"adm" );
			generatedPassword=c.generatePassword();
			break;
		}
		case 3:{
			generatedEmail=c.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(),"hr" );
			generatedPassword=c.generatePassword();
			break;
		}
		case 4:{
			generatedEmail=c.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"leg" );
			generatedPassword=c.generatePassword();
			break;
			
		}
		default:{
			System.out.println("Enter a valid choice");
		}
		
		}
		employee.setEmail(generatedEmail);
		employee.setPassword(generatedPassword);
		
		c.showCredentials(employee);
		sc.close();
		
		
	}

}
