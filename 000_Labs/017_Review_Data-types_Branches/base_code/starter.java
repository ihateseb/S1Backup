/*
 *	Author:  Sebastian Blunt
 *  Date: 9/24/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Name your character! ");
		System.out.print("Enter a name: ");
		String username=sc.nextLine();
		System.out.println("");
		System.out.print("Now give your character a title(mr, ms, master, mistress) : ");
		String usertitle=sc.nextLine();
		System.out.println("");
		String userchar = usertitle +" "+ username;
		System.out.println("Would you like to be a mage, warrior, or a rogue?");
		
		
		String userin=sc.nextLine();
		String Mage = new String("Mage");
		String mage = new String("mage");
		String Warrior = new String("Warrior");
		String warrior = new String("warrior");
		String Rogue = new String("Rogue");
		String rogue = new String("rogue");
		
		String wmr = new String();
		
		
		if((userin.equals(mage)) || userin.equals(Mage)){
			System.out.println("You selected the mage class.");
			wmr = "Mage";
		}
		if((userin.equals(warrior)) || userin.equals(Warrior)){
			System.out.println("You selected the warrior class.");
			wmr = "Warrior";
		}
		if((userin.equals(rogue)) || userin.equals(Rogue)){
			System.out.println("You selected the rogue class.");
			wmr = "Rogue";
		}
		
		
		System.out.println("You now get to assign your stats!");
		System.out.println("Here are the statistics that you can select from");
		System.out.println("1. Strength - Buff and able to carry larger items.");
		System.out.println("2. Dexterity - Agile and moves quick.");
		System.out.println("3. Intelligence - Better at magic spells!");
		System.out.println("4. Charisma - How personable.");
		
		System.out.println("You get 20 SP (stat points) to assign to your stats as you please.");
		System.out.println("You can add a maximum of 10 points to any one stat.");
		System.out.println("Type the number the corresponds the the stat you would like to invest SP into.");
		
		int SP = 20;
		int str = 0;
		int dex = 0;
		int smar = 0;
		int riz = 0;
	
		
		while(SP>0){
			//FIRST STAT
			String statno = sc.nextLine();
			if(statno.equals("1")){
				System.out.println("How many points would you like to invest?");
				System.out.println("SP: " + SP);
				int  invest = sc.nextInt();
				sc.nextLine();
				str = str + invest;
				SP=SP-invest;
				if(str>10){
					System.out.println("You cannot add more than 10 SP to any given stat");
					System.out.println("Your str stats have been reset and used SP has been refunded. Please try again.");
					str = str - invest;
					SP = SP + invest;
					System.out.println("How many points would you like to invest?");
				invest = sc.nextInt();
				sc.nextLine();
				str = str + invest;
				SP=SP-invest;
				
				if(str>10){
					System.out.println("You have failed to allocate an acceptable amount of points to this stat, please try again.");
					return;
				}
				if(SP>0){
				System.out.println("Please type the number of the stat you would like to invest SP into");
				
			}
			else if(SP<=0){
				break;
			}
					
				}
			if(SP>0){
				System.out.println("Please type the number of the stat you would like to invest SP into");
				
			}
			else if(SP<=0){
				break;
			}
				
			}
			//third STAT
			
			if(statno.equals("3")){
				System.out.println("How many points would you like to invest?");
				System.out.println("SP: " + SP);
				int  invest = sc.nextInt();
				sc.nextLine();
				smar = smar + invest;
				SP=SP-invest;
				if(smar>10){
					System.out.println("You cannot add more than 10 SP to any given stat");
					System.out.println("Your intelligence stats have been reset and used SP has been refunded. Please try again.");
					smar = smar - invest;
					SP = SP + invest;
					System.out.println("How many points would you like to invest?");
				invest = sc.nextInt();
				sc.nextLine();
				smar = smar + invest;
				SP=SP-invest;
				
				if(smar>10){
					System.out.println("You have failed to allocate an acceptable amount of points to this stat, please try again.");
					return;
				}
				if(SP>0){
				System.out.println("Please type the number of the stat you would like to invest SP into");
				
			}
			else if(SP<=0){
				break;
			}
					
				}
			if(SP>0){
				System.out.println("Please type the number of the stat you would like to invest SP into");
				
			}
			else if(SP<=0){
				break;
			}
				
			}
			//second STAT
			
			if(statno.equals("2")){
				System.out.println("How many points would you like to invest?");
				System.out.println("SP: " + SP);
				int  invest = sc.nextInt();
				sc.nextLine();
				dex = dex + invest;
				SP=SP-invest;
				if(dex>10){
					System.out.println("You cannot add more than 10 SP to any given stat");
					System.out.println("Your dex stats have been reset and used SP has been refunded. Please try again.");
					dex = dex - invest;
					SP = SP + invest;
					System.out.println("How many points would you like to invest?");
				invest = sc.nextInt();
				sc.nextLine();
				dex = dex + invest;
				SP=SP-invest;
				
				if(dex>10){
					System.out.println("You have failed to allocate an acceptable amount of points to this stat, please try again.");
					return;
				}
				if(SP>0){
				System.out.println("Please type the number of the stat you would like to invest SP into");
				
			}
			else if(SP<=0){
				break;
			}
					
				}
			if(SP>0){
				System.out.println("Please type the number of the stat you would like to invest SP into");
				
			}
			else if(SP<=0){
				break;
			}
				
			}
			//FOURTH STAT
			if(statno.equals("4")){
				System.out.println("How many points would you like to invest?");
				System.out.println("SP: " + SP);
				int  invest = sc.nextInt();
				sc.nextLine();
				riz = riz + invest;
				SP=SP-invest;
				if(riz>10){
					System.out.println("You cannot add more than 10 SP to any given stat");
					System.out.println("Your Charisma stats have been reset and used SP has been refunded. Please try again.");
					riz = riz - invest;
					SP = SP + invest;
					System.out.println("How many points would you like to invest?");
				invest = sc.nextInt();
				sc.nextLine();
				riz = riz + invest;
				SP=SP-invest;
				
				if(riz>10){
					System.out.println("You have failed to allocate an acceptable amount of points to this stat, please try again.");
					return;
				}
				if(SP>0){
				System.out.println("Please type the number of the stat you would like to invest SP into");
				
			}
			else if(SP<=0){
				break;
			}
					
				}
			if(SP>0){
				System.out.println("Please type the number of the stat you would like to invest SP into");
				
			}
			else if(SP<=0){
				break;
			}
				
			}
		}
		System.out.println("Your characters name is "+userchar+", and your class is "+wmr+". You invested "+str+" points into strength, "+dex+" points into dexterity, "+smar+" points into intelligence, "+riz+" points into charisma.");
		
		
	}
}
