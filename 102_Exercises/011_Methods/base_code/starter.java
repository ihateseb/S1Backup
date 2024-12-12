/*
 *	Author: Sebastian Blunt
 *  Date: 10/14/24
 * 	Collaborator(s): none 
*/
import java.util.Scanner;
import java.util.Random;


class starter {
	// The goal of the first method is to give back whether the year given is a leap year or not. 2004 is a leap year.
	public static boolean isLeapYear(int yr){
		
		if(yr%4==0){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static int getDigitSum(int number){
		int sum=0;
		
		while(number>0){
			sum = sum + (number % 10);
			number = number / 10;
		}
		return sum;
	}

	

	// The goal of the third method is to check if 3 numbers are consecutive. 15 16 17 are consecutive. It will print if they are or not.
	// Assume that the first number is always the smallest and the third number is always the largest.
	public static void printIfConsecutive(int one1, int two2, int three3){
		if(one1+1==two2&&two2+1==three3){
			System.out.println("These numbers are consecutive.");
			
		}
		else{
			System.out.println("These numbers are not consecutive.");
		}
	}

	public static void main(String args[]) {
		System.out.println("----------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = sc.nextInt();
		System.out.println();
		if(isLeapYear(year))
			System.out.println(year + " is a leap year!");
		else
			System.out.println(year + " is not a leap year!");

		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a 5 digit number");
		int number = sc.nextInt();
		int sum = getDigitSum(number);
		System.out.println();
		System.out.println("The sum of the digits of " + number + " is " + sum);

		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a number");
		int num1 = sc.nextInt();
		System.out.println("Enter a number");
		int num2 = sc.nextInt();
		System.out.println("Enter a number");
		int num3 = sc.nextInt();
		System.out.println();
		printIfConsecutive(num1, num2, num3);
		System.out.println();
		System.out.println("----------------------------------------");
	}
}

