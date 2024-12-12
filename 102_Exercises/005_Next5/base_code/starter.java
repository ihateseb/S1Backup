/*
 *	Author: Sebastian Blunt
 *  Date: 9/11/24
 *	Collaborator(s): none
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type any integer");
		int userin = sc.nextInt();
		int system1 = userin;
		//NEXT 5 INTEGERS
		System.out.println("The next 5 integers of your number are: ");
		while(system1<=userin+5){
		
		System.out.print(system1 + ", ");
		system1=system1+1;
		
		}
		System.out.println(" ");
		System.out.print("The next 5 multiples of your number are: ");
		system1=userin;
		while(system1<=userin*6){
			System.out.print(system1 + ", ");
			system1 = system1+userin;
				
		}
		System.out.println(" ");
		double redo;
		redo = userin;
		double system2;
		double system3;
		system2=redo/100;
		system3=redo/10;
		System.out.println("Your number devided by 100 equals: " + system2);
		System.out.println("Your number devided by 10 equals: " + system3);

	}
}
