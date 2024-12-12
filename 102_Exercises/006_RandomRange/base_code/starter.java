/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer to be the start of your range: ");
		int n1=sc.nextInt();
		System.out.println("Enter an integer to be the end of your range: ");
		int n2= sc.nextInt();
		int x = (int) (Math.random()*(n2-n1))+n1;
		System.out.print("5 numbers that are in that range are: "+x);
		int y = (int) (Math.random()*(n2-n1))+n1;
		System.out.print(", "+y);
		int z = (int) (Math.random()*(n2-n1))+n1;
		System.out.print(", "+z);
		int a = (int) (Math.random()*(n2-n1))+n1;
		System.out.print(", "+a);
		int b = (int) (Math.random()*(n2-n1))+n1;
		System.out.print(", "+b);
	}
}
