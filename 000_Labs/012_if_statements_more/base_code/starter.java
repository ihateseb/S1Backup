/*
 *	Author:  sebastian blunt
 *  Date: 9/23/24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a integer: ");
		int x = sc.nextInt();
		System.out.println("Enter another integer: ");
		int y = sc.nextInt();
		if(x==y){
			System.out.println("Both integers are the same value.");
		}
		if(x!=y){
			System.out.println("The integers do not have the same value.");
		}
	}
}
