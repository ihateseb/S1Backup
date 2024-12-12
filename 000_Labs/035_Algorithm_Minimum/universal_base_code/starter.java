/*
 *	Author:  Sebastian Blunt
 *  Date: 11/7/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		int randsize = (int) (Math.random()*150)+51;
		int [] rands = new int[randsize];
		
		
		for(int x = 0;x < rands.length; x++){
			rands[x]=(int) (Math.random()*100)+1;
		}
		
		//MINIMUM
		int min = Integer.MAX_VALUE;
		for(int i=0; i < rands.length; i++){
			if(rands[i]<min){
				
				min=rands[i];
			}
		}
		
		//MAXIMUM
		int max = Integer.MIN_VALUE;
		for(int i = 0; i <rands.length; i++){
			if(rands[i]>max){
				max=rands[i];
			}
		}
		
		//ELEMENTS
		int size= rands.length;
		
		//AVERAGE
		int totalValue = 0;
		for(int c =0; c<rands.length; c++){
			totalValue=totalValue+rands[c];
		}
		double AVG = (totalValue * 1.0)/rands.length;
		
		System.out.println("MINIMUM: "+min);
		System.out.println("MAXIMUM: "+max);
		System.out.println("AVERAGE: "+AVG);
		int elements = rands.length;
		System.out.println("# OF ELEMENTS: "+elements);
		
	}
}
