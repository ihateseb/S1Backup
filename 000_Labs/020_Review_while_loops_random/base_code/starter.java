/*
 *	Author:  Sebastian Blunt
 *  Date: 10/3/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int random= (int) ((Math.random()*1000)+1);
		System.out.println("A random number has been generated!");
		System.out.println("Try your best to guess it! (1-1000");
		System.out.println("Take your first guess!");
		while(true){
			
			int userint= sc.nextInt();
			
			if(userint==random){
				
				break;
				
			}
			else{
				System.out.println("Nice try, but you didnt get it. Try Again.");
			}
		}
		System.out.println("Good Job! You guessed it right. Here's a cookie. ");



		
	}
}
