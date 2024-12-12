/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		
		Employee Dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		Dwight.employeeToString();
		
		Employee jim=new Employee(2474, "Jim", "Halpert", 4416.66);
		jim.employeeToString();
		
		Employee Pam = new Employee(2011, "Pam", "Beesly", 2250.0);
		Pam.employeeToString();
		
		Employee Logan = new Employee(2009, "Logan", "Manson", 3822.20);
		Logan.employeeToString();
		
		michael.raiseSalary(15);
		Dwight.raiseSalary(15);
		jim.raiseSalary(10);
		Pam.raiseSalary(29);
		Logan.raiseSalary(73);
		
		System.out.println("AFTER RAISES\n\n");
		
		
		System.out.println("ANNUAL SALARY FOR MICHAEL: "+michael.getAnnualSalary());
		michael.employeeToString();
		
		System.out.println("ANNUAL SALARY FOR DWIGHT: " + Dwight.getAnnualSalary());
		Dwight.employeeToString();
		
		System.out.println("ANNUAL SALARY FOR JIM: " + jim.getAnnualSalary());
		jim.employeeToString();
		
		System.out.println("ANNUAL SALARY FOR PAM: " + Pam.getAnnualSalary());
		Pam.employeeToString();
		
		System.out.println("ANNUAL SALARY FOR LOGAN: " + Logan.getAnnualSalary());
		Logan.employeeToString();
		
		
	}
}
