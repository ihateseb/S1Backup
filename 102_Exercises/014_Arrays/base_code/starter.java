/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int [] arr = new int[1001];
		 int y=0;
		 while(y<1001){
		 	arr[y]=y*3+3;
		 	System.out.print(arr[y]+", ");
		 	y=y+1;
		 }
		 System.out.print("-------------------------------------------------------");
		 int [] arr2 = new int[1001];
		 int A = 0;
		 while(A<1001){
		 	arr2[A]=1000-A;
		 	System.out.print(arr2[A]+ ", ");
		 	A++;
		 }
	}
}
