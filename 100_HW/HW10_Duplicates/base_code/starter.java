/*
 *	Author: Sebastian Blunt
 *  Date: 11/12/24
 * 	Collaborator(s): None 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int [] arr = new int[20];
		for(int i = 0; i <arr.length;i++){
			arr[i]=(int) (Math.random()*9)+1;
		}
		int random = (int) (Math.random()*9)+1;
		for(int i = 0; i<arr.length;i++){
			if(arr[i]==random){
				System.out.println("Array #" +i+" is equal to "+random);
			}
		}
		for(int i = 0; i < arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                System.out.println("Consect at " + i + " and " + (i+1)+". They were equal to "+arr[i]);
            }
        
	}
}
}
