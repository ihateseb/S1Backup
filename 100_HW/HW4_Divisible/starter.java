/*
 *	Author: Sebastian Blunt
 *  Date: 9/29/24
 * 	Collaborator: none
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// INTAKE NUMBERS
		System.out.println("Please input an integer");
		int first = sc.nextInt();
		System.out.println("Please input another integer");
		int second = sc.nextInt();
		//CHECK THE INPUTS
		int fircheck = first%2;
		int seccheck = second%2;
		if(fircheck!=0){
			System.out.println(first + " is not an even number.");
		}
		else{
			System.out.println(first + " is an even number.");
		}
		if(seccheck!=0){
			System.out.println(second + " is not an even number.");
		}
		else{
			System.out.println(second + " is an even number.");
		}
		//CHECK IF DIVISIBLE BY OTHER NUMBERS
		if(first%3==0 && first%4==0 && first%5==0){
			System.out.println(first + " is divisible by 3, 4, and 5.");
		}
		else{
			System.out.println(first + " is not divisible by 3, 4, and 5.");
		}
		if(second%3==0 && second%4==0 && second%5==0){
			System.out.println(second + " is divisible by 3, 4, and 5.");
		}
		else{
			System.out.println(second + " is not divisible by 3, 4, and 5.");
		}
	}
}
