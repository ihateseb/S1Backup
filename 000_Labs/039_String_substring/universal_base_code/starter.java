/*
 *Author:  Sebastian Blunt
 *  Date:  12/8
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
public static void main(String args[]) {
// Your code goes below here
BaseClass test = new BaseClass();
Scanner sc = new Scanner(System.in);
System.out.println("Enter a word: ");
String input = sc.nextLine();
for(int i = 0;i<input.length();i++){
System.out.println(input.substring(i,i+1));
}
}
}