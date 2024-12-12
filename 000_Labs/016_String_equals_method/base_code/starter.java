/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to be a mage, warrior, or a rogue?");
		String userin=sc.nextLine();
		String Mage = new String("Mage");
		String mage = new String("mage");
		String Warrior = new String("Warrior");
		String warrior = new String("warrior");
		String Rogue = new String("Rogue");
		String rogue = new String("rogue");
		System.out.print("The class you have selected is ");
		if((userin.equals(mage)) || userin.equals(Mage)){
			System.out.println("You selected the mage class.");
		}
		if((userin.equals(warrior)) || userin.equals(Warrior)){
			System.out.println("You selected the warrior class.");
		}
		if((userin.equals(rogue)) || userin.equals(Rogue)){
			System.out.println("You selected the rogue class.");
		}
		
	}
}
