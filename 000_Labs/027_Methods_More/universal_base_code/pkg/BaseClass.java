/*
 *Author:  Sebastian Blunt
 *  Date: 12/8
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myToString {

String role;
int strength;
int dexterity;
int intelligence;
int charisma;

public myToString() {
role = "No Role";
}

public static String setRole (String role) {
if(role.equals("Warrior") || role.equals("Rogue") || role.equals("Wizard")) {
return role;
}
else {
role = "No Role"; 
}
return role;
}

public static int setStrength (int strength) {
if(strength<=0) {
strength = 0;
}
return strength;
}

public static int setDexterity (int dexterity) {
if(dexterity<=0) {
dexterity = 0;
}
return dexterity;
}

public static int setIntelligence (int intelligence) {
if(intelligence<=0) {
intelligence = 0;
}
return intelligence;
}

public static int setCharisma (int charisma) {
if(charisma<=0) {
charisma = 0;
}
return charisma;
}

public static void myToString(myToString output) {
System.out.println("Role: " + output.role);
System.out.println("Strength: " + output.strength);
System.out.println("Dexterity: " + output.dexterity);
System.out.println("Intelligence: " + output.intelligence);
System.out.println("Charisma: " + output.charisma);
}

public static boolean setAll(String role, int strength, int dexterity, int intelligence, int charisma, myToString output) {
output.role = setRole(role);
output.strength = setStrength(strength);
output.dexterity = setDexterity(dexterity);
output.intelligence = setIntelligence(intelligence);
output.charisma = setCharisma(charisma);

if(!output.role.equals("No Role") && output.strength > -1 && output.dexterity > -1 && output.intelligence > -1 && output.charisma > -1){
return true;
}
else{
return false;
}
}

}