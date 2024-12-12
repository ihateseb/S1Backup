/*
	Author: sebastian blunt
	Date: 12/5/24
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a word: ");
		String input = sc.nextLine();
		
		while(true){
			if(input.indexOf(" ")==-1){
				System.out.print(spongeCase(input));
				break;
			}
			int space = input.indexOf(" ");
			String word = input.substring(0, space);
			System.out.print(spongeCase(word)+ " ");
			input = input.substring(space+1);
		}
		
	}
	
	public static String spongeCase(String word){
		String spongeCase=new String ("");
		for(int i = 0; i<word.length();i++){
			String place = word.substring(i,i+1);
			if(i%2==0){
				String upperX=place.toUpperCase();
				spongeCase=spongeCase+ upperX;
			}
			else{
				String lowerX=place.toLowerCase();
				spongeCase=spongeCase+lowerX;
			}
			
		}
		return spongeCase;
	}
}
