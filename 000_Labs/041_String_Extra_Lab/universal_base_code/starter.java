/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		int i = 0;
		String reversed = new String ("");
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a phrase to be reversed: ");
		String input = sc.nextLine();
		String [] arr = new String [input.length()];
		while(true){
			if(input.indexOf(" ")==-1){
				arr[i]=input;
				break;
				
			}
		int space= input.indexOf(" ");
		String word = input.substring(0, space);
		arr[i]=word;
		i++;
		input = input.substring(space+1);
	}
	String revCon = new String ("");
	for(int x=i;x>-1;x--){
		revCon=revCon+arr[x]+" ";
	}
	System.out.println(revCon);
}
}
