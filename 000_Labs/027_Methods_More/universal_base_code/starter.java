/*
 *Author:  Sebastian Blunt
 *  Date: 12/8
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
public static void main(String args[]) {
// Your code goes below here
Scanner sc = new Scanner(System.in);
myToString character = new myToString();
String role;
int strength;
int dexterity;
int intelligence;
int charisma;
System.out.print("What role would you like your character to be? (Warrior, Wizard, or Rogue): ");
role = sc.nextLine();
System.out.print("\n");
System.out.print("Enter your strength: ");
strength = sc.nextInt();
System.out.print("\n");
System.out.print("Enter your dexterity: ");
dexterity = sc.nextInt();
System.out.print("\n");
System.out.print("Enter your intelligence: ");
intelligence = sc.nextInt();
System.out.print("\n");
System.out.print("Enter your charisma: ");
charisma = sc.nextInt();
System.out.print("\n");
myToString.setAll(role, strength, dexterity, intelligence, charisma, character);
myToString.myToString(character);
}
}