/*
 *Author:  Sebastian Blunt
 *  Date: 12/8
*/

import java.util.Scanner;
import java.util.Random;

class starter {
public static void main(String args[]) {
// Your code goes below here
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
int x = sc.nextInt();
System.out.print("\n");
System.out.print("To the power of?: ");
int y = sc.nextInt();
System.out.print("\n");
System.out.print(pow(x,y));
}

public static int pow(int x, int y){
int k=0;
int j=x;
while(k<y){
x=x*j;
k=k+1;
}
return x/2;
}
}