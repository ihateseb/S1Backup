/*
 *Author:  Sebastian Blunt
 *  Date: 12/8
*/

import pkg.*;
import java.util.*;

class starter {
public static void main(String args[]) {
// Your code goes below here
String winame = "Jamal";
Wizard [] wi = new Wizard[100];
for(int i = 0;i<wi.length;i++){
wi[i] = new Wizard(winame);
}

String waname = "Henry";
Warrior [] wa = new Warrior[100];
for(int i = 0;i<wa.length;i++){
wa[i] = new Warrior(wa=name);
}

int wacount = 0;
int wicount = 0;
while(true){
wi[wicount].attack(wa[wacount]);
if(wa[wacount].isDead()){
if(wacount<99) wacount++;
}
wa[wacount].attack(qi[wicount]);
if(wi[wicount].isDead()){
if(wicount<99) wicount++;
}
}

if(wi[99].isDead()){
int walives = 0;
for(int i=0;i<wa.length;i++){
if(wa[i].isDead()==false){
walives++;
}
}
System.out.println("Warriors Win!\nThere are " + walives + " warriors left standing.");
break;
}

if(wa[99].isDead()){
int wilives = 0;
for(int i=0;i<wi.length;i++){
if(wi[i].isDead()==false){
wilives++;
}
}
System.out.println("Wizards Win!\nThere are " + wilives + " wizards left standing.");
break;
}
}
}