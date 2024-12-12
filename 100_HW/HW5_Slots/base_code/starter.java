/*
 *	Author:Sebastian Blunt
 *  Date: 10/06/24
 * 	Collaborator(s): none
*/ 

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		System.out.println("Slot Machine Rules:\n1. Each player starts with $100.\n2. Input a wager less than your total amount of money.\n3. The slot machine will roll 3 numbers from 1 to 10.\n  a. If two numbers match, you double your money.\n  b. If three numbers match, you triple your money.\n  c. If none match, you lose your money.\n-------------------------------------------------------");
		Scanner sc=new Scanner(System.in);
		//Variable creation
		int money = 100;
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		String play;
		int bid = 0;
		//Loop start
		while(money>=0){
			System.out.println("Would you like to play?\n (Yes, yes, Y, y, No, no, N, n: ");
			play = sc.nextLine();
			if(play.equals("no")||play.equals("No")||play.equals("N")||play.equals("n")){
				System.out.println("Ok, come back sometime soon!");
				System.out.println("Final balance: $"+money);
				return;
			}
			else if(play.equals("Yes")||play.equals("yes")||play.equals("Y")||play.equals("y")){
				System.out.println("You have $"+money+".");
				System.out.println("How much would you like to bid? : ");
				bid = sc.nextInt();
				sc.nextLine();
				if(bid<=0){
					System.out.println("You cannot bid less than $1.");
					System.out.println("You have $"+money+".");
					
				}
				else if(bid>money){
					System.out.println("You cannot bid more than your balance");
					System.out.println("You have $"+money+".");
				}
				else if(bid>0&&bid<=money){
					money=money-bid;
					System.out.println("Spinning...");
					num1 = (int) (Math.random()*9)+1;
					num2 = (int) (Math.random()*9)+1;
					num3 = (int) (Math.random()*9)+1;
					System.out.println("-------------");
					System.out.println("| "+num1+" | "+num2+" | "+num3+" |");
					
					if(num1==num2&&num2==num3){
						money=money+(bid*3);
						System.out.println("-------------");
						System.out.println("You Won!");
						System.out.println("Balance : $"+money);
						System.out.println("");
					}
					else if(num1==num2||num1==num3||num2==num3){
						money=money+(bid*2);
						System.out.println("-------------");
						System.out.println("You Won!");
						System.out.println("Balance : $"+money);
						System.out.println("");
					}
					else{
						System.out.println("-------------");
						System.out.println("You lost...");
						System.out.println("Balance remaining: $"+money);
						System.out.println("");
						if(money==0){
							System.out.println("You ran out of money!");
							System.out.println("Try again later!");
							return;
					}
				}
			}
		}
		
		}
		
	}
}
