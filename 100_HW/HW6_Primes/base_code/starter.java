/*
 *	Author: Sebastian Blunt
 *  Date: 10/13/24
*/

import java.util.Scanner;

class starter {
	public static boolean checkPrime(int input){
		int divisor = input - 1;
		boolean primeFlag = false;
		if(input == 2){
			primeFlag = true;
			return primeFlag;
		}
		while(divisor >= 2){
			if (input % divisor != 0){
				primeFlag = true;
			}
			if (input % divisor == 0){
				primeFlag = false;
				break;
			}
			divisor--;
		}
		return primeFlag;
	}
	
	public static void printPrimes(int input){
		boolean isPrimeCheck;
		while(input > 2){
			isPrimeCheck = checkPrime(input);
			if(isPrimeCheck) System.out.print(input + " ");
			input--;
		}
		return;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int input;
		boolean prime;
		System.out.print("Enter an integer, and all Prime Numbers below it will be printed: ");
		input = sc.nextInt();
		printPrimes(input);
		
	}
}
