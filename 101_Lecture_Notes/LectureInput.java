/* 
    Lecture note example - Input and Scanner
*/
import java.util.Scanner;
class LectureInput{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name ");
        String log = sc.nextLine();
        System.out.println("Hello " + log);
        System.out.println("Please enter a number: ");
        int se = sc.nextInt();
        sc.nextLine();
        System.out.println("Please enter another number: ");
        int lo = sc.nextInt();
        sc.nextLine();
        int selo = se + lo;
        System.out.println("The sum of those numbers is " + selo);
        System.out.println("What is your favorite food?");
        String food = sc.nextLine();
	}
}