/*
 *Author:  Sebastian Blunt
 *  Date: 12/7/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
public static String randName(){
int rand = (int)(Math.random()*7);
switch(rand){
case 0: return "Dopey"; 
case 1: return "Bashful";
case 2: return "Grumpy";
case 3: return "Sleepy";
case 4: return "Sneezy";
case 5: return "Happy";
case 6: return "Doc";
            default: return "Happy";
}
}

public static int randAge(){
int r = (int) (Math.random()*10);
return r;
}

public static void main(String args[]) {
// Your code goes below here
PooleDwarf dwarf = new PooleDwarf();
PooleDwarf dwarf1 = new PooleDwarf(randName(), randAge());
PooleDwarf dwarf2 = new PooleDwarf(randName(), randAge());
PooleDwarf dwarf3 = new PooleDwarf(randName(), randAge());
PooleDwarf dwarf4 = new PooleDwarf(randName(), randAge());
PooleDwarf dwarf5 = new PooleDwarf(randName(), randAge());
PooleDwarf dwarf6 = new PooleDwarf(randName(), randAge());
PooleDwarf dwarf7 = new PooleDwarf(randName(), randAge());
System.out.println(dwarf1.getName());
System.out.println(dwarf2.getName());
System.out.println(dwarf3.getName());
System.out.println(dwarf4.getName());
System.out.println(dwarf5.getName());
System.out.println(dwarf6.getName());
System.out.println(dwarf7.getName());
int d = 0;
for(int i=0;i<6;i++){
switch(i){
//case 0:
if(dwarf2.isSameName(dwarf1.getName()) d++)
break;
//case 1:
if(dwarf3.isSameName(dwarf1.getName()) d++)
break;
//case 2:
if(dwarf4.isSameName(dwarf1.getName()) d++)
break;
//case 3:
if(dwarf5.isSameName(dwarf1.getName()) d++)
break;
//case 4:
if(dwarf6.isSameName(dwarf1.getName()) d++)
break;
//case 5:
if(dwarf7.isSameName(dwarf1.getName()) d++)
break;
}
}
System.out.println("\nThere are" + d + "duplicates, of the name: " + dwarf1.getName());
}
}